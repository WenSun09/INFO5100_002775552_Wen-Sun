public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (double)this.radius * this.radius * Math.PI;
    }

    public double calculatePerimeter() {
        return (double)this.radius * Math.PI * 2;
    }

    public void printColor() {
        System.out.println("Circle color:" + this.color);
    }
}
