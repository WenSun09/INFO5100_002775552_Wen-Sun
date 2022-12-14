// Oracle JDK 19
public class Main {
    public static void main(String[] args) {
        // Singleton Pattern Example
        System.out.println("Singleton Pattern Example");
        Singleton singleton = new Singleton();
        singleton.SingletonPatternExample();

        // Factory Pattern Example
        System.out.println("Factory Pattern Example");
        Factory factory = new Factory();
        factory.FactoryPatternExample();

        // Facade Pattern Example
        System.out.println("Facade Pattern Example");
        Facade facade = new Facade();
        facade.FacadePatternExample();
    }
}