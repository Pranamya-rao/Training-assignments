
import java.lang.Thread;

public class ThreadCycle extends Thread {

        public static void main(String[] args) throws InterruptedException {
            ThreadCycle tx = new ThreadCycle();
            System.out.println("Thread State before start: " + tx.getState());//New Object Created
            tx.start();
            System.out.println("Thread State after start: " + tx.getState());
            Thread.sleep(5000);
            System.out.println("Thread State after start: " + tx.getState());
        }
    }
