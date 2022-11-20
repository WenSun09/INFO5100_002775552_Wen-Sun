import java.util.Date;

public class Table {
    String name;
    String manufacturer;
    Date manufactureDate;
    double weight;
    double length;
    double height;
    double width;
    String color;

    public Table(String name) {
        this.name = name;

        System.out.println("Creating a table, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.color;
    }
}
