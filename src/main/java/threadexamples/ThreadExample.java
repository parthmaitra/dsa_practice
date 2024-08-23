package threadexamples;

public class ThreadExample {
    static Object mutex = new Object();
    public static void main(String[] args) {
        EvenThread even = new EvenThread(mutex);
        Thread evenThread = new Thread(even);
        OddThread odd = new OddThread(mutex);
        Thread oddThread = new Thread(odd);
        oddThread.start();
        evenThread.start();

    }

}
