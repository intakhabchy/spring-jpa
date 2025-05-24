package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String firstName);

    public List<Student> findByLastNameNotNull();

    public List<Student> findByGuardianName(String name);

    // JPQL
    @Query("SELECT s FROM Student s where s.emailId = ?1")
    public Student getStudentByEmailId(String emailId);

    @Query("SELECT s.firstName FROM Student s where s.emailId = ?1")
    public String getFirstNameByEmailId(String emailId);
}
