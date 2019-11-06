package com.codecool.questostoreapi;

import com.codecool.questostoreapi.models.users.Student;
import com.codecool.questostoreapi.repositories.MentorRepository;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class QuestostoreapiApplication {
    //private static final Logger logger = LogManager.getLogger(QuestostoreapiApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(QuestostoreapiApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(MentorRepository mr, StudentRepository sr) {
//        return (args) -> {
//            // save a few customers
//            sr.save(new Student(50,5, "student", "student", "marek", "ziomek", "544032056", "student@student", "gdzies tam 15/4" ));
//            // fetch all customers
//        };
//    }

//    public void run(ApplicationArguments applicationArguments) throws Exception {
//        logger.debug("Debugging log");
//        logger.info("Info log");
//        logger.warn("Hey, This is a warning!");
//        logger.error("Oops! We have an Error. OK");
//        logger.fatal("Damn! Fatal error. Please fix me.");
//    }

}
