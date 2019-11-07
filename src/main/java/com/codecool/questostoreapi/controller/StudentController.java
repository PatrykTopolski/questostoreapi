package com.codecool.questostoreapi.controller;

import com.codecool.questostoreapi.models.users.Student;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.apache.log4j.Logger;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {

    private final StudentRepository studentRepository;
    private Logger logger = Logger.getLogger(StudentServiceREST.class.getName());

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/api/students")
    //example of another way to handle config security
    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    List<Student> getAllStudents(){
        logger.info("get students request");
        return studentRepository.findAll();
    }
    @PostMapping("/api/students")
    Student postStudent(@RequestBody Student student)
    {   logger.info("post student request");
        return  studentRepository.save(student);
    }
    @PutMapping("/api/students/{id}")
    Student putStudent(@RequestBody Student newStudent, @PathVariable Integer id){
        logger.info("put student request");
        return studentRepository.findById(id).map(student -> {
            student.setAddress(newStudent.getAddress());
            student.setAmountOfCoins(newStudent.getAmountOfCoins());
            student.setArtifacts(newStudent.getArtifacts());
            student.setEmail(newStudent.getEmail());
            student.setFirstName(newStudent.getFirstName());
            student.setLastName(newStudent.getLastName());
            student.setLogin(newStudent.getLogin());
            student.setPassword(newStudent.getPassword());
            student.setPhoneNum(newStudent.getPhoneNum());
            student.setLvlOfExp(newStudent.getLvlOfExp());
        return studentRepository.save(student);})
                .orElseGet(() -> {
                    newStudent.setId(id);
                    return studentRepository.save(newStudent);
                });
    }

    @DeleteMapping("/api/students/{id}")
    void deleteById(@PathVariable int id)
    {   logger.info("delete student request");
        studentRepository.deleteById(id);
    }
}
