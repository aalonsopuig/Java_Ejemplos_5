package b_hilos_synch_sumador_restador;

public class IncrementerThread extends Thread {
    private SynchronizedCounter counter;

    IncrementerThread(SynchronizedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100); // Simula trabajo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

