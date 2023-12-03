package c_hilos_synch_CarreraCamellos;

/*
 * Carrera de Camellos Virtual
 * Desarrollar un programa en Java que simule una carrera de camellos. 
 * Cada camello será representado por un hilo que avanza a lo largo de una pista. 
 * Deberás utilizar mecanismos de sincronización para controlar el acceso a la línea de meta 
 * y asegurar que solo un camello sea declarado ganador.
 */

/**
 * La clase CarreraCamellos simula una carrera de camellos.
 * Cada camello es representado por un hilo que avanza en la pista de carrera.
 */
public class CarreraCamellos {

    protected final int longitudPista;  // Longitud de la pista de carrera.  
    private volatile int camelloGanador = -1; // Variable para mantener el registro del camello ganador.

    /**
     * Constructor para crear una pista de carrera.
     *
     * @param longitudPista La longitud de la pista de carrera.
     */
    public CarreraCamellos(int longitudPista) {
        this.longitudPista = longitudPista;
    }

    /**
     * Método sincronizado para determinar y anunciar el camello ganador.
     *
     * @param idCamello Identificador del camello que llega a la meta.
     */
    public synchronized void cruzarMeta(int idCamello) {
        if (camelloGanador == -1) {
            camelloGanador = idCamello;
            System.out.println("El camello " + idCamello + " ha ganado la carrera!");
        }
        else {
            System.out.println("El camello " + idCamello + " ha llegado");
        }
    }

    /**
     * Método principal que inicia la carrera.
     *
     * @param args No utilizado.
     */
    public static void main(String[] args) {
        int numeroDeCamellos = 5;
        CarreraCamellos carrera = new CarreraCamellos(50);

        for (int i = 0; i < numeroDeCamellos; i++) {
            new Camello(carrera, i).start();
        }
    }
}
