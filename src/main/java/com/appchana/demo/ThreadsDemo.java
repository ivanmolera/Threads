package main.java.com.appchana.demo;

/**
 * Created by ivanmolera on 06/02/2018.
 */
public class ThreadsDemo {

    public static void main(String[] args) {
        System.out.println("main class");

        // Extending Thread class
        for (int i = 0; i < 25 ; i++) {
            MyExtendedThread thread = new MyExtendedThread();
            thread.start();
        }

        // Implementing Runnable
        for (int i = 0; i < 25 ; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
