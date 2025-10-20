package com.example.my_api;

import com.example.my_api.controller.Students;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;

    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public void insertStudent(Students student) {
        studentRepository.save(student);
    }

    public  Students getStudentById( Integer id ) {
    return studentRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException(id + "not found"));
    }

    public void deleteStudentById(Integer id) {
        studentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Student with ID " + id + " not found"));
        studentRepository.deleteById(id);
    }
public void updateStudent(Integer id, Students updatedStudent) {
    Students  existingStudent = studentRepository.findById(id).orElseThrow(()-> new IllegalStateException("Student with " + id + " not found"));
        existingStudent.setName(updatedStudent .getName());
        existingStudent.setTechStack(updatedStudent.getTechStack());
    studentRepository.save(existingStudent);

}
}
