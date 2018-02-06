package main.java.com.appchana.demo;

/**
 * Created by ivanmolera on 06/02/2018.
 */
public class ThreadsDemo {

    public static void main(String[] args) {
        System.out.println("main class");

        for (int i = 0; i < 25 ; i++) {
            MyExtendedThread thread = new MyExtendedThread();
            thread.start();
        }
    }
}
