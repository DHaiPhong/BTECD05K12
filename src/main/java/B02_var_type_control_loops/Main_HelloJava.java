/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B02_var_type_control_loops;

/**
 *
 * @author NC
 */
public class Main_HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Sekai");
        int s = sum(2,3);
        System.out.println(s);
        System.out.println(sum(4, 6));
        System.out.println(sum(3.5, 4.5));
        System.out.println(sum(3));
    }

    private  static  int sum(int a,int b){

        System.out.println("int version");
        return a+b;
    }

    private static double sum(double a,double b){

        System.out.println("double version");
        return a+b;
    }
    private static int sum(int k){
        if(k>0){
            return k + sum(k - 1);
        }else{
            return 0;
        }
    }
}
