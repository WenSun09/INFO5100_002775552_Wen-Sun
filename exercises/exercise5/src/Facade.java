// Facade Pattern Example
public class Facade {
    public Facade () {}

    public void FacadePatternExample() {
        Shop shop = new Shop();
        shop.saleIPhone();
        shop.saleSamsung();
    }
}
