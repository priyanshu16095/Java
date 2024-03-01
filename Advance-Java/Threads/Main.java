package src.java.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // METHODS FOR THREAD
        System.out.println(Thread.activeCount());

        Thread.currentThread().setName("Main Thread");
        System.out.println("Name: " + Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println("Priority: " + Thread.currentThread().getPriority());

        System.out.println("Alive: " + Thread.currentThread().isAlive());
        System.out.println("Daemon: " + Thread.currentThread().isDaemon());

        for(int i = 1; i <= 10; i++) {
            System.out.print("-");
            Thread.sleep(200);
        }
        System.out.println();

        // CREATING THREAD USING THREADCLASS
        ThreadClass myThread = new ThreadClass();
        myThread.start();

        System.out.println("Active Threads: " + Thread.activeCount());
    }
}
