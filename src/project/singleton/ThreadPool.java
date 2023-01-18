package project.singleton;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private static ThreadPool instance = null;
    private ExecutorService threadPool;

    private ThreadPool() {
        threadPool = Executors.newFixedThreadPool(10);
    }

    public static ThreadPool getInstance() {
        if (instance == null) {
            instance = new ThreadPool();
        }
        return instance;
    }

    public void execute(Runnable myThread) {
        threadPool.execute(myThread);
    }

    public void shutdown() {
        threadPool.shutdown();
    }
}