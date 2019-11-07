package com.codecool.questostoreapi.repositories;


import com.codecool.questostoreapi.models.users.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
