package project.singleton;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ThreadPool threadPool = ThreadPool.getInstance();
        for (int i = 0; i < 10; i++) {
            Runnable worker = new MyThread("" + i);
            threadPool.execute(worker);
        }
        threadPool.shutdown();
    }
}
