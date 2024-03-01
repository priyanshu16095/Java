package src.java.Threads.Multithreading;

public class Thread_2 implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread-2: " + i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println("Some error occured!");
            }
        }
        System.out.println("Thread-2 is finished");
    }

}
