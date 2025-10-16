package com.example.my_api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")

public class StudentController {
    @GetMapping()
   public List<Students> getStudents() {
    return List.of(
            new Students(
                    1,
                    "Abeba",
                    "Node, js , react "
            ),

        new Students(
                2,
                "Diva",
                "java, Spring Boot , Nest "
        )
    );
    }
}