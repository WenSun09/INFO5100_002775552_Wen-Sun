public class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public double calculateArea() {
        return (double)this.side * this.side;
    }

    public double calculatePerimeter() {
        return (double)this.side * 4;
    }

    public void printColor() {
        System.out.println("Square color:" + this.color);
    }
}
