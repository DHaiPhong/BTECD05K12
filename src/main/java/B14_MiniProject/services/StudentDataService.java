/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B14_MiniProject.services;

import B14_MiniProject.models.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class StudentDataService {

    public List<Student> read(String path) throws IOException {

        List<Student> students = new ArrayList<>();

        //Path pathFileToRead = Paths.get("./resources/student-input.txt");
        Path pathFileToRead = Paths.get(path);

        List<String> allLines = Files.readAllLines(pathFileToRead);

        for (int i = 0; i < allLines.size(); ++i ) {

            String line = allLines.get(i);
            String[] data = line.split(",");

            Student student = new Student(Integer.parseInt(data[0]) , data[1], data[2], data[3]);

            students.add(student);
        }


        return students;
    }

    public void write(String path, List<Student> students) throws IOException {

        //List<Student> = List<String>;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < students.size(); ++i) {

            Student student = students.get(i);

            list.add(student.toString());
        }

        Path pathFileToWrite = Paths.get(path);

        Files.write(pathFileToWrite, list);

    }

}
