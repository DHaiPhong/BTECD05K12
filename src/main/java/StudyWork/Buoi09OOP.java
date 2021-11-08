/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package StudyWork;

/**
 *
 * @author NC
 */
public class Buoi09OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Moto mybike = new Moto();

        mybike.color = "Blue";
        mybike.weight = 1000.3f;
        mybike.cubic = 50;

        System.out.println(mybike.color);
        System.out.println(mybike.weight);
        System.out.println(mybike.cubic);

        mybike.run();
        mybike.stop();
    }

}

    class Moto {

        String color;
        float weight;
        float cubic;

    public void run() {
        System.out.println("Running...");

    }

    public void stop() {
        System.out.println("Stoped!");
    }

    }

