package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("test2@email.com")
                .firstName("First Name")
                .lastName("Last Name")
                .guardianName("Guardian Name")
                .guardianEmail("guardian@email.com")
                .guardianMobile("01888000006")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList: "+studentList);
    }
}