/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B10;

/**
 *
 * @author NC
 */
public class InheritanceEncapsulationDemoRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee employee = new Employee("Jone", "joneh@gmail.com", "987654321");

        //System.out.println(employee.name);
        System.out.println(employee.getName());

        employee.setName("Joe");

        System.out.println(employee.getName());

        //System.out.println(employee.email);
        System.out.println(employee.getEmail());

        employee.setEmail("joedoe@gmail.com");

        System.out.println(employee.getEmail());

        System.out.println(employee.getPhone());

        employee.setPhone("123456789");

        System.out.println(employee.getPhone());

    }

}
