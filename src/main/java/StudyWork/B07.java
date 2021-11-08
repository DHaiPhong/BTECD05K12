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
public class B07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bai7 = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        int n = bai7.nextInt();

        int [] arr = new int[n];
        double sum = 0;

        System.out.println("Nhap vao phan tu trong mang: ");
        for ( int i = 0; i < n; ++i){
            System.out.printf("a[%d]: \n",i+1);
            arr[i] = bai7.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Tong cac phan tu cua n la: " +sum);

        int tonggt = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Giai thua cua phan tu thu" +(i + 1)+ "la: " +gt(arr[i]) );
            tonggt += gt(arr[i]);
        }

        System.out.println("Tong cac giai thua cua phan tu trong mang la: " +tonggt);

        sortarr(arr);
        System.out.println("Phan tu trong mang duoc sap xep tang dan: ");
        showsortarr(arr);
    }
    public static long gt(int n) {
        int temp = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for ( int i = 2; i <= n; i++) {
                temp *= i;
            }
        }

        return temp;

    }
    public static void sortarr(int [] arr) {
        int index = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for ( int j = i + 1; j < arr.length; j++) {
                if ( arr[i] > arr[j]) {
                index = arr[j];
                arr[j] = arr[i];
                arr[i] = index;
            }
            }
        }
    }
    public static void showsortarr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}
