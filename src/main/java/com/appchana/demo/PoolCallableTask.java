package main.java.com.appchana.demo;

import java.util.concurrent.Callable;

/**
 * Created by ivanmolera on 06/02/2018.
 */
public class PoolCallableTask implements Callable<String> {

    private PoolResponse poolResponse = null;

    public PoolCallableTask(PoolResponse poolResponse) {
        this.poolResponse = poolResponse;
    }

    @Override
    public String call() {
        String response = Thread.currentThread().getName() + ": ";

        for (int i = 5; i >= 0; i--) {
            response += i + " ";
        }

        poolResponse.concat(response);
        return response;
    }
}
