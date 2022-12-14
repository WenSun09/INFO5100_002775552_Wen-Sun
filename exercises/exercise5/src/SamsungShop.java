// Facade Pattern Example
public class SamsungShop implements PhoneShop{
    @Override
    public void phoneModel() {
        System.out.println("Samsung Galaxy S22");
    }

    @Override
    public void phonePrice() {
        System.out.println("1200$");
    }
}
