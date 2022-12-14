// Factory Pattern Example
public class PhoneFactory {
    public Phone manufacturePhone(String brand) {
        switch (brand) {
            case "IPhone":
                return new IPhone();
            case "Samsung":
                return new Samsung();
        }
        return null;
    }
}
