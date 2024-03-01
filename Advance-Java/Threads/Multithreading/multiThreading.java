package src.java.Threads.Multithreading;

public class multiThreading {
    public static void main(String[] args) throws InterruptedException {
//    Multithreading : Process of executing multiple threads simultaneously
//                     Helps maximum utilisation of CPU
//                     src.java.Threads are independent, they don't affect of executiong of other threads
//                     An exception in a thread will not interrupt other threads
//                     Useful for serving multiple clients.

        Thread_1 thread1 = new Thread_1();

        Thread_2 runnable = new Thread_2();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        System.out.println();

        thread1.start();
        thread1.join(2000);
        thread2.start();

    }

}
