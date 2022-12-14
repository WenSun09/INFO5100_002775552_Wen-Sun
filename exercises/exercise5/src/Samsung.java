// Factory Pattern Example
public class Samsung implements Phone{
    public Samsung() {
        this.manufacture();
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture Samsung");
    }
}
