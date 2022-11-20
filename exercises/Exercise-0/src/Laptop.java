public class Laptop {
    class CPU {
        String name;
        String manufacturer;

        public CPU(String name) {
            this.name = name;
            System.out.println("Creating a cpu, name: " + this.name);
        }

        public String getName() {
            return this.name;
        }
    }

    class GPU {
        String name;
        String manufacturer;

        public GPU(String name) {
            this.name = name;
            System.out.println("Creating a gpu, name: " + this.name);
        }

        public String getName() {
            return this.name;
        }
    }

    String name;
    String manufacturer;
    double weight;
    double length;
    double width;
    CPU cpu;
    GPU gpu;
    String operatingSystem;

    public Laptop(String name, String cpuName, String gpuName) {
        this.cpu = new CPU(cpuName);
        this.gpu = new GPU(gpuName);
        this.name = name;

        System.out.println("Creating a laptop, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public String getCPUName() {
        return this.cpu.getName();
    }

    public String getGPUName() {
        return this.gpu.getName();
    }
}
