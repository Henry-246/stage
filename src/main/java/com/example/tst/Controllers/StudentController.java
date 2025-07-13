package com.example.tst.Controllers;

import com.example.tst.Models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private final List<Student> students = new ArrayList<Student>(List.of(
            new Student(1, "Skipper", 12),
            new Student(2, "Mario", 12),
        new Student(3, "John", 12)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("students")
    public List<Student> addStudent(@RequestBody Student student) {
        students.add(student);
        return students;
    }
}
