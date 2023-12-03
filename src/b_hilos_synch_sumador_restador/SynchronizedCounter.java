package b_hilos_synch_sumador_restador;

/**
 * Esta clase representa un contador compartido que puede ser accedido por
 * múltiples hilos.
 * Proporciona métodos sincronizados para incrementar y decrementar el valor del
 * contador.
 */
public class SynchronizedCounter {

    // Variable que mantiene el valor actual del contador.
    private int count = 0;

    /**
     * Incrementa el valor del contador.
     * Este método está sincronizado para evitar el acceso concurrente.
     */
    public synchronized void increment() {
        count++;
        System.out.println("Incrementado: " + count);
    }

    /**
     * Decrementa el valor del contador.
     * Este método también está sincronizado para asegurar la consistencia del
     * contador.
     */
    public synchronized void decrement() {
        count--;
        System.out.println("Decrementado: " + count);
    }

    /**
     * Obtiene el valor actual del contador.
     * 
     * @return El valor actual del contador.
     */
    public synchronized int getCount() {
        return count;
    }
}

