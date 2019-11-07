package com.codecool.questostoreapi.controller;

import com.codecool.questostoreapi.models.users.Student;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping()
    //example of another way to handle config security
//    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    @PostMapping()
    Student postStudent(@RequestBody Student student){
        return  studentRepository.save(student);
    }
    @PutMapping( value = "/{id}")
    Student putStudent(@RequestBody Student newStudent, @PathVariable Integer id){
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

    @DeleteMapping(value = "/{id}")
    void deleteById(@PathVariable int id) {
        studentRepository.deleteById(id);
    }
}
