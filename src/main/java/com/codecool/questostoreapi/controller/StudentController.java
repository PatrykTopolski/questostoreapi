package com.codecool.questostoreapi.controller;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.models.users.Student;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;
    private Logger logger = Logger.getLogger(StudentController.class.getName());

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping()
    //example of another way to handle config security
//    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    List<Student> getAllStudents(){
        logger.info("get Students request");
        return studentRepository.findAll();
    }
    @PostMapping()
    Student postStudent(@RequestBody Student student){
        logger.info("post student request");
        return  studentRepository.save(student);
    }
    @PutMapping( value = "/{id}")
    Student putStudent(@RequestBody Student newStudent, @PathVariable Integer id){
        logger.info("put student request");
        return studentRepository.findById(id).map(student -> {
            student.setAddress(newStudent.getAddress());
            student.setAmountOfCoins(newStudent.getAmountOfCoins());
            student.setEmail(newStudent.getEmail());
            student.setFirstName(newStudent.getFirstName());
            student.setLastName(newStudent.getLastName());
            student.setLogin(newStudent.getLogin());
            student.setPassword(newStudent.getPassword());
            student.setPhoneNum(newStudent.getPhoneNum());
            student.setLvlOfExp(newStudent.getLvlOfExp());
            List<Artifact> artifacts = newStudent.getArtifacts();
            student.setArtifacts(artifacts);
        return studentRepository.save(student);
        })
                .orElseGet(() -> {
                    newStudent.setId(id);
                    return studentRepository.save(newStudent);
                });
    }

    @DeleteMapping(value = "/{id}")
    void deleteById(@PathVariable int id) {
        logger.info("delete student request");
        studentRepository.deleteById(id);
    }
}
