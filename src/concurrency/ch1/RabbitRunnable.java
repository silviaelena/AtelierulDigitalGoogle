package concurrency.ch1;

public class RabbitRunnable implements Runnable {
    private int id;

    public RabbitRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + id + " is running from Runnable");
    }
}
