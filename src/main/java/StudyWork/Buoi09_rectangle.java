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
        rec.perimeter();
        rec.area();

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

    public void perimeter() {

        float per = length * width;
        System.out.println("Dien tich hinh chu nhat la: " +per);

    }
    public void area() {

        float ar = (length + width) * 2;
        System.out.println("Chu vi hinh chu nhat la: " +ar);
    }
}