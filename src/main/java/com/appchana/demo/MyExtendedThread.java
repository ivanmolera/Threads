package main.java.com.appchana.demo;

/**
 * Created by ivanmolera on 06/02/2018.
 */
public class MyExtendedThread extends Thread {

    @Override
    public void run() {

        for (int i = 5; i >= 0; i--) {
            System.out.println("My extended thread " + Thread.currentThread().getName() + " countdown: " + i);
        }

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + Thread.currentThread().getName());
        }
    }
}
