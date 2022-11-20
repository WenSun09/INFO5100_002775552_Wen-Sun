public class Main {
    public static void main(String[] args) {
        // Triangle
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area:" + triangle.calculateArea());
        System.out.println("Triangle perimeter:" + triangle.calculatePerimeter());
        triangle.printColor();

        // Rectangle
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area:" + rectangle.calculateArea());
        System.out.println("Rectangle perimeter:" + rectangle.calculatePerimeter());
        rectangle.printColor();

        // Circle
        Shape circle  = new Circle (5);
        System.out.println("Circle  area:" + circle.calculateArea());
        System.out.println("Circle  perimeter:" + circle.calculatePerimeter());
        circle.printColor();

        // Square
        Shape square = new Square(5);
        System.out.println("Square area:" + square.calculateArea());
        System.out.println("Square perimeter:" + square.calculatePerimeter());
        square.printColor();
    }
}