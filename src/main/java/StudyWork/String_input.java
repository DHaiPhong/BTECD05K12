package StudyWork;

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
        System.out.println("Nhap so sinh vien: ");
        Scanner myObj = new Scanner(System.in);
        int SoSV = myObj.nextInt();
        myObj.nextLine();

        for ( int i = 0; i < SoSV; ++i){
        System.out.println(" Nhap ho ten sv");
        String HoTen = myObj.nextLine();
        System.out.println("Nhap Tuoi: ");
        int Tuoi = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Nhap Lop: ");
        String Lop = myObj.nextLine();
        System.out.println("Nhap Diem Toan");
        float DiemToan = myObj.nextFloat();
        System.out.println("Nhap Diem Ly");
        float DiemLy = myObj.nextFloat();
        System.out.println("Nhap Diem Hoa");
        float DiemHoa = myObj.nextFloat();
        myObj.nextLine();
        float DTB = (DiemToan + DiemLy + DiemHoa)/3;

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

}
