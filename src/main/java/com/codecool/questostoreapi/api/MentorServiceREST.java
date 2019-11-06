package com.codecool.questostoreapi.api;

import com.codecool.questostoreapi.models.users.Mentor;
import com.codecool.questostoreapi.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MentorServiceREST {
    @Autowired
    private MentorRepository repository;

    @GetMapping("/api/mentor")
    public List<Mentor> getAllMentors(){
        return repository.findAll();
    }

    @GetMapping("/api/mentor/{mentorId}")
    public Mentor getMentorById(@PathVariable String mentorId){
        return repository.getById(Integer.parseInt(mentorId));
    }
}
