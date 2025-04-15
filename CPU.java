class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    class Processor {
        private int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public void displayProcessorInfo() {
            System.out.println("Processor Details:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void displayRAMInfo() {
            System.out.println("RAM Details:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public void displayPrice() {
        System.out.println("CPU Price: ₹" + price);
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(25000.0);
        cpu.displayPrice();

        CPU.Processor processor = cpu.new Processor(8, "Intel");
        processor.displayProcessorInfo();

        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        ram.displayRAMInfo();
    }
}

