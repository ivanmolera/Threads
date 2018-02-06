package main.java.com.appchana.demo;

import java.util.concurrent.Callable;

/**
 * Created by ivanmolera on 06/02/2018.
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {

        if(Thread.currentThread().getId() % 2 == 1) {
            Thread.sleep(1000);
        }
        else {
            Thread.sleep(500);
        }

        String response = Thread.currentThread().getName() + ": ";

        for (int i = 5; i >= 0; i--) {
            System.out.println("My callable " + Thread.currentThread().getName() + " countdown: " + i);
            response += i + " ";
        }
        return response;
    }
}
