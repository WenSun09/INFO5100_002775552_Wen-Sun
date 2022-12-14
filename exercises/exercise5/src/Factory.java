// Factory Pattern Example
public class Factory {
    public Factory () {}

    public void FactoryPatternExample() {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iphone = phoneFactory.manufacturePhone("IPhone");
        Phone samsung = phoneFactory.manufacturePhone("Samsung");
    }
}
