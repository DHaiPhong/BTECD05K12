/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B14_MiniProject.controllers;

import B14_MiniProject.models.Student;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author admin
 */
public class StudentManager {

    public void sortByName(List<Student> list) {

        Collections.sort(list, (s1, s2) -> {return s1.getName().compareTo(s2.getName());});

        }

    public void sortById(List<Student> list) {

        Collections.sort(
                list,
                (s1, s2) -> Integer.compare(s1.getId(), s2.getId())
        );
    }

    public Student findByName(List<Student> list, String name) {

        for (Student s: list) {

            if (s.getName().equals(name)) {
                return s;
            }
        }

        return null;
    }

    public Student findById(List<Student> list, int id) {

        for (Student s: list) {

            if (s.getId() == (id)) {
                return s;
            }
        }
        return null;
    }
}

