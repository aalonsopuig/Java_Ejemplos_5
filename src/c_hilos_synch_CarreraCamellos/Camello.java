package c_hilos_synch_CarreraCamellos;

/**
 * La clase Camello representa un competidor en la carrera de camellos.
 * Cada camello es un hilo que intenta llegar al final de la pista.
 */
class Camello extends Thread {

    // Carrera en la que el camello compite.
    private final CarreraCamellos carrera;
    // Identificador del camello.
    private final int idCamello;
    // Posición actual del camello en la pista.
    private int posicion;

    /**
     * Constructor para el camello.
     *
     * @param carrera    Carrera en la que el camello competirá.
     * @param idCamello  Identificador del camello.
     */
    public Camello(CarreraCamellos carrera, int idCamello) {
        this.carrera = carrera;
        this.idCamello = idCamello;
        this.posicion = 0;
    }

    /**
     * Método que se ejecuta cuando el hilo del camello se inicia.
     * El camello avanza por la pista hasta llegar a la meta.
     */
    @Override
    public void run() {
        while (posicion < carrera.longitudPista) {
            // Simula el avance del camello.
            posicion += avanzar();
            System.out.println("Camello " + idCamello + " está en la posición " + posicion);
            // Pequeña pausa para simular el tiempo de avance.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Camello " + idCamello + " ha cruzado la meta!");
    }

    /**
     * Simula el avance del camello en la pista.
     *
     * @return Número de posiciones que avanza el camello.
     */
    private int avanzar() {
        // Aquí se podría implementar lógica para avance aleatorio o basado en características del camello.
        return 1 + (int)(Math.random() * 5);
    }
}
