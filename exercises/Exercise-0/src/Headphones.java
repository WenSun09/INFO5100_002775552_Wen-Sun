import java.util.Date;

public class Headphones {
    String name;
    String manufacturer;
    Date manufactureDate;
    boolean isWired;
    boolean isConnected;
    double weight;
    String color;
    boolean isNoiseCancelling;

    public Headphones(String name) {
        this.name = name;

        System.out.println("Creating headphones, name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public boolean isNoiseCancelling() {
        return this.isNoiseCancelling;
    }

    public String getColor() {
        return this.color;
    }
}
