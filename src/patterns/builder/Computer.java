package patterns.builder;

public class Computer {
    private String RAM;
    private boolean bluetooth;
    private String storage;
    private String CPU;
    private String GPU;
    private String audio;

//    public Computer(String RAM, boolean bluetooth, String storage, String CPU, String GPU, String audio) {
//        this.RAM = RAM;
//        this.bluetooth = bluetooth;
//        this.storage = storage;
//        this.CPU = CPU;
//        this.GPU = GPU;
//        this.audio = audio;
//    }

    private Computer() {
    }

    private Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.bluetooth = builder.bluetooth;
        this.storage = builder.storage;
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.audio = builder.audio;
    }

    public String toString() {
        return "Computer specs: RAM - " + RAM + " bluetooth " + bluetooth + " storage " + storage + " CPU " + CPU
                + " GPU " + GPU + " audio " + audio + "\n";
    }


    static public class Builder {
        private String RAM;
        private boolean bluetooth;
        private String storage;
        private String CPU;
        private String GPU;
        private String audio;

        public Builder(String RAM) {
            this.RAM = RAM;
        }

        public Computer build() {
            return new Computer(this);
        }

        public Builder setAudio(String audio) {
            this.audio = audio;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
    }

}