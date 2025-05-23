package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Guardian;
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
//                .guardianName("Guardian Name")
//                .guardianEmail("guardian@email.com")
//                .guardianMobile("01888000006")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .name("guardian name")
                .email("guardian@email.com")
                .mobile("09953494052")
                .build();

        Student student = Student.builder()
                .firstName("First_Name")
                .lastName("Last_Name")
                .emailId("my@email.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList: "+studentList);
    }

    @Test
    public void printStudentByFirstName(){

//        List<Student> students = studentRepository.findByFirstName("John");
        List<Student> students = studentRepository.findByFirstNameContaining("Joh");

        System.out.println("students: "+students);
    }

    @Test
    public void printStudentBasedOnGuardianName() {
        List<Student> students = studentRepository.findByGuardianName("guardian name 2");
        System.out.println("students: " + students);
    }

}