package threadexamples;

public class EvenThread implements Runnable {
    Object mutex;
    private int i=0;
    private int counter=10;
    public EvenThread(Object mutex) {
        this.mutex = mutex;
    }

    @Override
    public void run() {
        try {
            printEven();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void printEven() throws InterruptedException {
        synchronized (mutex) {
            while(i<counter) {
                System.out.println(i);
                i+=2;
                Thread.sleep(1000);
                mutex.notify();
                mutex.wait();
            }
        }
    }
}

