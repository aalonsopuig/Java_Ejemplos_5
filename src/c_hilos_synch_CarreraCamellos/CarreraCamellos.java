package c_hilos_synch_CarreraCamellos;

/**
 * La clase CarreraCamellos simula una carrera de camellos.
 * Cada camello es representado por un hilo que avanza en la pista de carrera.
 */
public class CarreraCamellos {

    // Longitud de la pista de carrera.
    protected int longitudPista;

    /**
     * Constructor para crear una pista de carrera.
     *
     * @param longitudPista La longitud de la pista de carrera.
     */
    public CarreraCamellos(int longitudPista) {
        this.longitudPista = longitudPista;
    }

    /**
    * Método principal que inicia la carrera.
    *
    * @param args No utilizado.
    */
    public static void main(String[] args) {
        int numeroDeCamellos = 5;
        CarreraCamellos carrera = new CarreraCamellos(100);

        for (int i = 0; i < numeroDeCamellos; i++) {
            new Camello(carrera, i).start();
        }
    }
}
