// Facade Pattern Example
public class IPhoneShop implements PhoneShop {
    @Override
    public void phoneModel() {
        System.out.println("IPhone 13");
    }

    @Override
    public void phonePrice() {
        System.out.println("1000$");
    }
}
