package com.codecool.questostoreapi.controller;

import com.codecool.questostoreapi.models.users.Mentor;
import com.codecool.questostoreapi.repositories.MentorRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/mentor")
public class MentorController {
    @Autowired
    private MentorRepository repository;
    @Autowired
    private HttpServletRequest request;

    private Logger logger = Logger.getLogger(MentorController.class.getName());

    @GetMapping()
    public List<Mentor> getAllMentors(){
        logger.info("get mentors request");
        return repository.findAll();
    }

    @GetMapping(value = "/{mentorId}")
    Mentor getMentorById(@PathVariable String mentorId) throws EntityNotFoundException
    {   logger.info("get mentor request");
    if(repository.existsById(Integer.parseInt(mentorId))){
        return repository.getById(Integer.parseInt(mentorId));
    } else throw new EntityNotFoundException("Mentor with provided Id doesn't found in database");
    }


    @PostMapping()
    Mentor newMentor(@RequestBody Mentor newMentor){
        logger.info("post mentor request");
        return repository.save(newMentor);
    }

    @DeleteMapping(value = "/{id}")
    void deleteById(@PathVariable int id){
        logger.info("delete mentor request");
        repository.deleteById(id);
    }

    @PutMapping(value = "/{id}")
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
                    mentor.setStudents(updatedMentor.getStudents());
                    return repository.save(mentor);
                })
                .orElseGet(()->{
                    updatedMentor.setId(id);
                    return repository.save(updatedMentor);
                });

    }
}
