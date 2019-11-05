package com.codecool.questostoreapi.repositories;

import com.codecool.questostoreapi.models.users.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface StudentRepository extends CrudRepository<Student, Integer> {
}
