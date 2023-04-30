package com.vlad.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Vlad Deryugin", 2, 5.1);
        Student student2 = new Student("Mihail Ivanov", 4, 7.5);
        Student student3 = new Student("Zaur Tregulov", 3, 8.6);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("начало работы метода getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
