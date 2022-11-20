public class Main {
    public static void main(String[] args) {
        Book designPatterns = new Book("Design Patterns");
        Book harryPotter = new Book("Harry Potter");
        Book lordOfRings = new Book("The Lord of the Rings");

        Chair diningChair = new Chair("Dining chair");
        Chair deskChair = new Chair("Desk chair");
        Chair highChair = new Chair("High chair");

        Dog bulldog = new Dog("Bulldog");
        Dog husky = new Dog("Husky");
        Dog poodle = new Dog("Poodle");

        Headphones airpods = new Headphones("AirPods");
        Headphones beats = new Headphones("Beats");
        Headphones sony = new Headphones("Sony");

        Keyboard logitech = new Keyboard("Logitech keyboard");
        Keyboard keychron = new Keyboard("Keychron keyboard");
        Keyboard corsair = new Keyboard("Corsair keyboard");

        Monitor alienware = new Monitor("Alienware monitor");
        Monitor dell = new Monitor("Dell monitor");
        Monitor lg = new Monitor("LG monitor");

        Laptop lenovo = new Laptop("Lenovo", "Intel", "Nvidia");
        Laptop macbook = new Laptop("Macbook", "M2", "M2");
        Laptop asus = new Laptop("ASUS", "Intel", "Nvidia");

        Mouse logitechMouse = new Mouse("Logitech mouse");
        Mouse corsairMouse = new Mouse("Corsair mouse");
        Mouse lenovoMouse = new Mouse("Lenovo mouse");

        Phone iphone = new Phone("iPhone");
        Phone samsung = new Phone("Samsung");
        Phone huawei = new Phone("Huawei");

        Table studyTable = new Table("Study table");
        Table diningTable = new Table("Dining table");
        Table outdoorTable = new Table("Outdoor table");
    }
}