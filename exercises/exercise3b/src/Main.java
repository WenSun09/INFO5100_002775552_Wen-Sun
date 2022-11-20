import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Triangle
        Shape triangleS = new Triangle(3, 4, 5);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/triangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(triangleS);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /triangle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Shape triangleD = null;
        try {
            FileInputStream fileIn = new FileInputStream("/triangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            triangleD = (Triangle)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Triangle class not found");
            c.printStackTrace();
        }
        System.out.println("Triangle area:" + triangleD.calculateArea());
        System.out.println("Triangle perimeter:" + triangleD.calculatePerimeter());
        triangleD.printColor();

        // Rectangle
        Shape rectangleS = new Rectangle(5, 10);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/rectangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(rectangleS);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /rectangle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Shape rectangleD = null;
        try {
            FileInputStream fileIn = new FileInputStream("/rectangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            rectangleD = (Rectangle)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Rectangle class not found");
            c.printStackTrace();
        }
        System.out.println("Rectangle area:" + rectangleD.calculateArea());
        System.out.println("Rectangle perimeter:" + rectangleD.calculatePerimeter());
        rectangleD.printColor();

        // Circle
        Shape circleS = new Circle (5);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/circle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(circleS);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /circle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Shape circleD = null;
        try {
            FileInputStream fileIn = new FileInputStream("/circle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            circleD = (Circle)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Circle class not found");
            c.printStackTrace();
        }
        System.out.println("Circle area:" + circleD.calculateArea());
        System.out.println("Circle perimeter:" + circleD.calculatePerimeter());
        circleD.printColor();

        // Square
        Shape squareS = new Square(5);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/square.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(squareS);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /square.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Shape squareD = null;
        try {
            FileInputStream fileIn = new FileInputStream("/square.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            squareD = (Square)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Square class not found");
            c.printStackTrace();
        }
        System.out.println("Square area:" + squareD.calculateArea());
        System.out.println("Square perimeter:" + squareD.calculatePerimeter());
        squareD.printColor();
    }
}