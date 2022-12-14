// Facade Pattern Example
public class Shop {
    private PhoneShop iphone;
    private PhoneShop samsung;

    public Shop() {
        this.iphone = new IPhoneShop();
        this.samsung = new SamsungShop();
    }

    public void saleIPhone() {
        this.iphone.phoneModel();
        this.iphone.phonePrice();
    }

    public void saleSamsung() {
        this.samsung.phoneModel();
        this.samsung.phonePrice();
    }
}
