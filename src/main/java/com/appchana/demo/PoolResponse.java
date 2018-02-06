package main.java.com.appchana.demo;

/**
 * Created by ivanmolera on 06/02/2018.
 */
public class PoolResponse {
    private String poolResponse = "Pool response =>";

    public String getText() {
        return poolResponse;
    }

    public synchronized void concat(String threadResponse) {
        this.poolResponse += "\n" + threadResponse;
    }
}
