package b_hilos_synch_sumador_restador;

    /**
 * Clase que representa un hilo que decrementa el contador.
 */
public class DecrementerThread extends Thread {
    private SynchronizedCounter counter;

    DecrementerThread(SynchronizedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.decrement();
            try {
                Thread.sleep(100); // Simula trabajo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

