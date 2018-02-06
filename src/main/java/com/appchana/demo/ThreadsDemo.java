package main.java.com.appchana.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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


        // Implementing Runnable interface
        for (int i = 0; i < 25 ; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }


        // Executor Service
        ExecutorService firstThreadPool = Executors.newFixedThreadPool(25);
        for (int i = 0; i < 25 ; i++) {
            firstThreadPool.execute(new MyRunnable());
        }
        firstThreadPool.shutdown();


        // Implementing Callable interface
        List<Future<String>> futures = new ArrayList<>();

        ExecutorService secondThreadPool = Executors.newFixedThreadPool(25);
        for (int i = 0; i < 25 ; i++) {
            futures.add(secondThreadPool.submit(new MyCallable()));
        }
        secondThreadPool.shutdown();

        for (Future<String> future : futures) {
            try {
                String response = future.get();
                System.out.println(response);
            }
            catch(InterruptedException | ExecutionException e) {
                System.out.println("Future exception: " + e.getMessage());
            }
        }
    }
}
