package com.codecool.questostoreapi;

import com.codecool.questostoreapi.models.users.Student;
import com.codecool.questostoreapi.repositories.MentorRepository;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuestostoreapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestostoreapiApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(MentorRepository mr, StudentRepository sr) {
        return (args) -> {
            // save a few customers
            sr.save(new Student(50,5, "student", "student", "marek", "ziomek", "544032056", "student@student", "gdzies tam 15/4" ));

            // fetch all customers




        };
    }
}
