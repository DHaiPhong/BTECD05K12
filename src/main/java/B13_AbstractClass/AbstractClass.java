/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B13_AbstractClass;

abstract class Shape {

    double x;
    double y;

    public Shape (double x) {
        this.x = x;
    }

    public Shape (double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract void area();

    void show() {
        System.out.println("Shape");
    }
}
class Rectangle extends Shape {
    public Rectangle (double x, double y) {
        super(x, y);
    }

    @Override
    void area() {
        double a = x * y;
        System.out.println("Area of retangle = " +a );
    }
    @Override
    void show() {
        //super.show();
        System.out.println("Rectangle");
    }
}

class Square extends Shape {
    public Square (double x) {
        super(x);
    }

    @Override
    void area() {
        double b = x * x;
        System.out.println("Area of Square = " +b );
    }
    @Override
    void show() {
        System.out.println("Square");
    }
}
public class AbstractClass {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.show();
        rectangle.area();

        Square square = new Square(6);
        square.show();
        square.area();

    }

}
