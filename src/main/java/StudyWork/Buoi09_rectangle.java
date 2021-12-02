/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package StudyWork;

/**
 *
 * @author NC
 */
import java.util.Scanner;
public class Buoi09_rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.input();
        System.out.printf("Chu vi hinh chu nhat la: ");
        System.out.println(rec.perimeter());
        System.out.printf("Dien tich hinh chu nhat la: ");
        System.out.println(rec.area());
    }

}

class Rectangle {

    float length;
    float width;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Nhap chieu dai: \n");
        length = scan.nextFloat();
        System.out.printf("Nhap chieu rong: \n");
        width = scan.nextFloat();

    }

    public double area() {
        return length * width;
    }
    public double perimeter() {
        return (length + width) * 2;
    }
}