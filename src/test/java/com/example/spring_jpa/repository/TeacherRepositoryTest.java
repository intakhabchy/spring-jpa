package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Course;
import com.example.spring_jpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course courseOOP = Course.builder()
                .title("OOP")
                .credit(4)
                .build();

        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(4)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("T_f_name")
                .lastName("T_l_name")
        //        .courses(List.of(courseOOP,courseDBA))
                .build();

        teacherRepository.save(teacher);
    }
}