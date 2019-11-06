package com.codecool.questostoreapi.api;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.models.users.Mentor;
import com.codecool.questostoreapi.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("api/mentor")
    Mentor newMentor(@RequestBody Mentor newMentor){
        return repository.save(newMentor);
    }

    @DeleteMapping("/api/mentor/{id}")
    void deleteById(@PathVariable int id){
        repository.deleteById(id);
    }
}
