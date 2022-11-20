import java.util.Date;

public class Monitor {
    String name;
    String manufacturer;
    double weight;
    double length;
    double height;
    String resolution;
    String color;
    Date manufactureDate;

    public Monitor(String name) {
        this.name = name;

        System.out.println("Creating a monitor, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getColor() {
        return this.color;
    }
}
