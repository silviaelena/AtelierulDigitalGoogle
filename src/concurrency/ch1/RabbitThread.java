package concurrency.ch1;

public class RabbitThread extends Thread {
    private int id;
    public RabbitThread( int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + id + " is running from Thread");
    }
}
