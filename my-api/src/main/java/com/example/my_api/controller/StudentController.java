package com.example.my_api.controller;
import com.example.my_api.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
   public List<Students> getStudents() {
    return studentService.getAllStudents();
    }
@PostMapping
    public void addNewStudent(
            @RequestBody  Students student) {
     studentService.insertStudent(student);

    }
    @GetMapping("{id}")
    public Students getStudentsById(
            @RequestParam Integer id ) {
       return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public  void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
     }
     @PutMapping("/{id}")
    public void updateStudentById(
            @PathVariable Integer id,
            @RequestBody Students updatedStudent
     ){
        studentService.updateStudent(id, updatedStudent);
     }
}