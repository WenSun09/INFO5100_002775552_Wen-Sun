// Factory Pattern Example
public class IPhone implements Phone {
    public IPhone() {
        this.manufacture();
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture IPhone");
    }
}
