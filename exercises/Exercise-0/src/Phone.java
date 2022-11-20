public class Phone {
    String name;
    String manufacturer;
    String color;
    double weight;
    double length;
    double width;
    String operatingSystem;
    String cpu;

    public Phone(String name) {
        this.name = name;
        System.out.println("Creating a phone, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getColor() {
        return this.color;
    }
}
