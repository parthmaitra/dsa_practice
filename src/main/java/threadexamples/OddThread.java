package threadexamples;

public class OddThread implements Runnable {
    Object mutex;
    private int i=1;
    private int counter=10;
    public OddThread(Object mutex) {
        this.mutex=mutex;
    }
    @Override
    public void run() {
        try {
            printOdd();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    void printOdd() throws InterruptedException {
        synchronized (mutex){
            while(i<counter) {
                mutex.wait();
                System.out.println(i);
                i+=2;
                Thread.sleep(1000);
                mutex.notify();
            }
        }
    }

}
