/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B14_MiniProject;

import B14_MiniProject.controllers.StudentManager;
import B14_MiniProject.models.Student;
import B14_MiniProject.services.StudentDataService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

       StudentDataService service = new StudentDataService();

       List<Student> students = service.read("./resources/student-input.txt");

        String choose = null;
        boolean exit = false;
        StudentManager studentmanager = new StudentManager("./resources/student-input.txt");

        showMenu();

        while (true) {
            choose = scanner.nextLine();

            switch (choose) {
                case "1" :
                    System.out.println("Add student: ");
                    studentmanager.addStudent(scanner);
                    break;
                case "2" :
                    System.out.println("Edit student: ");
                    studentmanager.editStudent(scanner);
                    break;
                case "3" :
                    System.out.println("Delete student: ");
                    studentmanager.deleteStudent(scanner);
                    break;
                case "4" :
                    System.out.println("Sort students by id: ");
                    studentmanager.sortById();
                    break;
                case "5" :
                    System.out.println("Sort students by name: ");
                    studentmanager.sortByName();
                    break;
                case "6" :
                    System.out.println("Show all students: ");
                    studentmanager.showAll();
                    break;
                case "0" :
                    System.out.println("Exit");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;

            }

            if(exit) {

                break;
            }

            showMenu();
        }

    }

    public static void showMenu() {
        System.out.println("------------Menu------------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Sort students by id");
        System.out.println("5. Sort students by name");
        System.out.println("6. Show all students");
        System.out.println("0. Exit!");
        System.out.println("----------------------------");
        System.out.println("Please choose: ");
    }

}
