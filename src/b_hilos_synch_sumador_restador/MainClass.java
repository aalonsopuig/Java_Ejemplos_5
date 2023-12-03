package b_hilos_synch_sumador_restador;

public class MainClass {
 
        /**
     * Método principal. Crea y ejecuta hilos que incrementan y decrementan el contador.
     *
     * @param args No utilizado.
     */
    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();

        // Creación de hilos
        Thread incrementerThread = new IncrementerThread(counter);
        Thread decrementerThread = new DecrementerThread(counter);

        // Iniciando los hilos
        incrementerThread.start();
        decrementerThread.start();

        try {
            incrementerThread.join();
            decrementerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final del contador: " + counter.getCount());
    }
}

