public class Keyboard {
    String name;
    String manufacturer;
    double weight;
    double length;
    double width;
    String color;
    boolean isBluetooth;
    int buttonNumbers;

    public Keyboard(String name) {
        this.name = name;

        System.out.println("Creating a keyboard, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public int getButtonNumbers() {
        return this.buttonNumbers;
    }

    public String getColor() {
        return this.color;
    }
}
