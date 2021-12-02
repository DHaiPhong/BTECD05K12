/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B12;

/**
 *
 * @author admin
 */
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automobike audi = new Audi();
        audi.showInfo();

        Automobike honda = new Honda();
        honda.showInfo();
}
}
class Automobike {
    void showInfo() {
        System.out.println("Automobike");
    }
}
class Audi extends Automobike {
    @Override()
    void showInfo() {
        System.out.println("Audi");
    }
}
class Honda extends Automobike {
    @Override()
    void showInfo() {
        System.out.println("Honda");
    }
}
