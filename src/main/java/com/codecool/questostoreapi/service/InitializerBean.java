package com.codecool.questostoreapi.service;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.repositories.ArtifactRepository;
import com.codecool.questostoreapi.repositories.MentorRepository;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {

    @Autowired
    ArtifactRepository artifactRepo;
    @Autowired
    StudentRepository studentRepo;
    @Autowired
    MentorRepository mentorRepo;

    public InitializerBean(){
    }

    public void createArtifacts(){
        artifactRepo.save(new Artifact("Combat training", "Private mentoring", 136));
        artifactRepo.save(new Artifact("Sanctuary", "You can spend a day in home office", 74));
        artifactRepo.save(new Artifact("Time Travel", "extend SI week assignment deadline by one day", 223));
        artifactRepo.save(new Artifact("Circle of Sorcery", "60 min workshop by a mentor(s) of the chosen topic", 290));
        artifactRepo.save(new Artifact("Summon Code Elemental", "Mentor joins a students team for a one hour", 190));
        artifactRepo.save(new Artifact("Tome of knowledge", "Extra material for the current topic", 137));
        artifactRepo.save(new Artifact("Transform mentors", "All mentors should dress up as pirates (or just funny) for the day", 118));
        artifactRepo.save(new Artifact("Teleport","The whole course goes to an off-school program instead for a day", 221));
    }

    public void createMentor(){};
}
