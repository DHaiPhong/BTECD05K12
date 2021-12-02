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

public class Main {

    public static void main(String[] args) throws IOException {

        StudentDataService service = new StudentDataService();

       List<Student> students = service.read("./resources/student-input.txt");

//        for (int i = 0; i < students.size(); ++i) {
//
//            System.out.println(students.get(i));
//        }
//
//        service.write("./resources/student-output.txt", students);

        StudentManager mng = new StudentManager();

        //mng.sortByName(students);

        //mng.sortById(students);



//        for (int i = 0; i < students.size(); ++i) {
//
//            System.out.println(students.get(i));
//        }

//        Student findByName = mng.findByName(students, "Nguyen Van A");
//
//        System.out.println(findByName);

//        Student findById = mng.findById(students, 1001);
//
//        System.out.println(findById);

    }


}
