package com.codecool.questostoreapi.controller;

import com.codecool.questostoreapi.models.users.Mentor;
import com.codecool.questostoreapi.repositories.MentorRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MentorController {
    @Autowired
    private MentorRepository repository;

    private Logger logger = Logger.getLogger(MentorController.class.getName());

    @GetMapping("/api/mentor")
    public List<Mentor> getAllMentors(){
        logger.info("get mentors request");
        return repository.findAll();
    }

    @GetMapping("/api/mentor/{mentorId}")
    Mentor getMentorById(@PathVariable String mentorId)
    {   logger.info("get mentor request");
        return repository.getById(Integer.parseInt(mentorId));
    }

    @PostMapping("api/mentor")
    Mentor newMentor(@RequestBody Mentor newMentor){
        logger.info("post mentor request");
        return repository.save(newMentor);
    }

    @DeleteMapping("/api/mentor/{id}")
    void deleteById(@PathVariable int id){
        logger.info("delete mentor request");
        repository.deleteById(id);
    }

    @PutMapping("/api/mentor/{id}")
    Mentor updateMentor(@RequestBody Mentor updatedMentor, @PathVariable int id){
        logger.info("put mentor request");
        return repository.findById(id)
                .map(mentor -> {
                    mentor.setFirstName(updatedMentor.getFirstName());
                    mentor.setLastName(updatedMentor.getLastName());
                    mentor.setLogin(updatedMentor.getLogin());
                    mentor.setPassword(updatedMentor.getPassword());
                    mentor.setAddress(updatedMentor.getAddress());
                    mentor.setEmail(updatedMentor.getEmail());
                    mentor.setPhoneNum(updatedMentor.getPhoneNum());
                    return repository.save(mentor);
                })
                .orElseGet(()->{
                    updatedMentor.setId(id);
                    return repository.save(updatedMentor);
                });

    }
}
