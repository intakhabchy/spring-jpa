package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Course;
import com.example.spring_jpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courses = courseRepository.findAll();

        System.out.println("courses: "+courses);
    }

    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher = Teacher
                .builder()
                .firstName("C_t_firstname")
                .lastName("C_t_lastname")
                .build();

        Course course = Course
                .builder()
                .title("Python")
                .credit(6)
                .teacher(teacher)
                .build();

        courseRepository.save(course);
    }
}