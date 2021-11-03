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

        String[] HoTen = new String[SoSV];
        int[] Tuoi = new int[SoSV];
        String[] Lop = new String[SoSV];
        float[] DiemToan = new float[SoSV];
        float[] DiemLy = new float[SoSV];
        float[] DiemHoa = new float[SoSV];
        double[] DTB = new double[SoSV];

        for ( int i = 0; i < SoSV; ++i){
        System.out.println(" Nhap ho ten sv");
        HoTen[i] = myObj.nextLine();
        System.out.println("Nhap Tuoi: ");
        Tuoi[i] = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Nhap Lop: ");
        Lop[i] = myObj.nextLine();
        System.out.println("Nhap Diem Toan");
        DiemToan[i] = myObj.nextFloat();
        System.out.println("Nhap Diem Ly");
        DiemLy[i] = myObj.nextFloat();
        System.out.println("Nhap Diem Hoa");
        DiemHoa[i] = myObj.nextFloat();
        myObj.nextLine();
        double DTB[i] = (DiemToan + DiemLy + DiemHoa)/3;

        System.out.println("Diem trung binh: " + DTB[i]);

        if ( DTB[i] >= 8) {
            System.out.println("Xep hang: Gioi");
        } else if ( 8 > DTB[i] && DTB[i] >= 6.5){
            System.out.println("Xep hang: Kha");
        } else if ( 6.5 > DTB[i] && DTB[i] >= 5 ){
            System.out.println("Xep hang: Trung Binh");
        } else {
            System.out.println("Xep hang: Yeu");
        }
        }
        }

}
