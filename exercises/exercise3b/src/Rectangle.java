public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return (double)this.length * this.width;
    }

    public double calculatePerimeter() {
        return (double)(this.length + this.width) * 2;
    }

    public void printColor() {
        System.out.println("Rectangle color:" + this.color);
    }
}
