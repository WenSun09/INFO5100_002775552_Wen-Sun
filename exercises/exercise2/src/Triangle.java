public class Triangle extends Shape {
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double p = (double)(this.side1 + this.side2 + this.side3) / 2.0;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double calculatePerimeter() {
        return (double)this.side1 + this.side2 + this.side3;
    }

    public void printColor() {
        System.out.println("Triangle color:" + this.color);
    }
}
