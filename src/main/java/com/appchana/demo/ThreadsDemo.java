package main.java.com.appchana.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

        // Executor Service
        ExecutorService executorPool = Executors.newFixedThreadPool(25);
        for (int i = 0; i < 25 ; i++) {
            executorPool.execute(new MyRunnable());
        }
        executorPool.shutdown();
    }
}
