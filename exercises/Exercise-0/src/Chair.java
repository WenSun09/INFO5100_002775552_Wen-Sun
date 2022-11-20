import java.util.Date;

public class Chair {
    String name;
    String manufacturer;
    Date manufactureDate;
    double weight;
    double height;
    String color;
    double price;
    String material;

    public Chair(String name) {
        this.name = name;

        System.out.println("Creating a chair, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getMaterial() {
        return this.material;
    }
}
