package patterns.builder;

public class Main {
    public static void main(String[] args) {
//        Computer computer = new Computer("16GB", true, "1TB", "i7", "RTX2060", "dolby");
        Computer.Builder builder = new Computer.Builder("16GB");

        builder.setBluetooth(true)
                .setStorage("1TB")
                .setCPU("i7")
                .setGPU("RTX2060")
                .setAudio("true");

        Computer computer = builder.build();
        builder.setStorage("512GB");
        Computer computer2 = builder.build();;

        System.out.println(computer);
        System.out.println(computer2);
    }
}
