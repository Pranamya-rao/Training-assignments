import java.lang.Thread;

public class SharedCounter {
    int count = 0;
    synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws Exception {
        SharedCounter c = new SharedCounter();
        java.lang.Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                c.increment();
            }
        });
        java.lang.Thread t2 = new java.lang.Thread(() -> {
            for(int i = 0; i < 100; i++){
                c.increment();
            }
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("final count = " + c.count);
    }
}