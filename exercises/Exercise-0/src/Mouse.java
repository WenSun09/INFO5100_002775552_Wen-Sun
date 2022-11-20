public class Mouse {
    String name;
    String manufacturer;
    double weight;
    double length;
    double width;
    String color;
    boolean isBluetooth;
    String chargingMethod;

    public Mouse(String name) {
        this.name = name;

        System.out.println("Creating a mouse, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public boolean isBluetooth() {
        return this.isBluetooth;
    }

    public String getColor() {
        return this.color;
    }
}
