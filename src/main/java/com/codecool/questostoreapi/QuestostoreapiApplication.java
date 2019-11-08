package com.codecool.questostoreapi;

import com.codecool.questostoreapi.models.users.Student;
import com.codecool.questostoreapi.repositories.MentorRepository;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class QuestostoreapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestostoreapiApplication.class, args);
    }


}
