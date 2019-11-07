package com.codecool.questostoreapi.repositories;

import com.codecool.questostoreapi.models.users.Mentor;
import com.codecool.questostoreapi.models.users.Student;
import com.google.gson.Gson;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;


public interface StudentRepository extends JpaRepository<Student, Integer> {


}
