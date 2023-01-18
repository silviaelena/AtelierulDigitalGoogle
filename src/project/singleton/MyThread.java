package project.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyThread implements Runnable {

    private String ID;

    public MyThread(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString(){
        return this.ID;
    }

    @Override
    public void run() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("Start of thread " + this.ID + ": " + dtf.format(startTime));
        busyWait();
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("End of thread " + this.ID + ": " + dtf.format(endTime));
    }

    private void busyWait() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
