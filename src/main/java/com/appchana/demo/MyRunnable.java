package main.java.com.appchana.demo;

/**
 * Created by ivanmolera on 06/02/2018.
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 5; i >= 0; i--) {
            System.out.println("My runnable " + Thread.currentThread().getName() + " countdown: " + i);
        }
    }
}
