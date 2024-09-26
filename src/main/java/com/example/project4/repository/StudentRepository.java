package com.example.project4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project4.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {

}
