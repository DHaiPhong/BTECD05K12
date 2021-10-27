/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NC
 */
import java.util.Scanner;
public class String_input {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Nhap vao ho ten sv, tuoi, lop, diem cac mon Toan, Ly, Hoa ");
        String HoTen = myObj.nextLine();
        int Tuoi = myObj.nextInt();
        int Lop = myObj.nextInt();
        double DiemToan = myObj.nextDouble();
        double DiemLy = myObj.nextDouble();
        double DiemHoa = myObj.nextDouble();

        System.out.println("Ho Ten: " + HoTen);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Lop: " + Lop);
        System.out.println("Diem Toan: " + DiemToan);
        System.out.println("Diem Ly:" + DiemLy);
        System.out.println("Diem Hoa: " + DiemHoa);

        double DTB = (DiemToan + DiemLy + DiemHoa)/3;

        System.out.println("Diem trung binh: " + DTB);

        if ( DTB >= 8) {
            System.out.println("Xep hang: Gioi");
        } else if ( 8 > DTB && DTB >= 6.5){
            System.out.println("Xep hang: Kha");
        } else if ( 6.5 > DTB && DTB >= 5 ){
            System.out.println("Xep hang: Trung Binh");
        } else {
            System.out.println("Xep hang: Yeu");
        }
        }

}
