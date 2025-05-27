package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Course;
import com.example.spring_jpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder()
                .title("DSA")
                .credit(3)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.coursematerial.com")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }
}