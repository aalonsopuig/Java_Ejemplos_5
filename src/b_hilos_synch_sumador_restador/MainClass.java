package b_hilos_synch_sumador_restador;
/*
 * Objetivo: Desarrollar un programa en Java que demuestre el uso efectivo de la sincronización 
 * en un entorno de programación multihilo.
 * 
 * Descripción: Implementar una clase SynchronizedCounter en Java que mantendrá un contador compartido. 
 * Este contador será modificado por múltiples hilos para demostrar la sincronización de acceso a un 
 * recurso compartido. El programa debe evitar condiciones de carrera y garantizar la consistencia 
 * de los datos del contador.

 */
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

