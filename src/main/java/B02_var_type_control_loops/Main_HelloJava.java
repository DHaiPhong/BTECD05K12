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
        System.out.println(interativeFactorial(4));
        System.out.println(caculateFactorial(5));
        //System.err.println(sum(1,2,3,4,5));
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
    private static int interativeFactorial(int N) {

        int factorial = 1;
        for (int i = 1; i <= N; ++i){
            factorial *=i;
        }

        return factorial;
    }
    private static int caculateFactorial(int N) {

        if ( N != 0) {

            return N * caculateFactorial(N - 1);
        } else {
            return 1;
        }
    }

}
