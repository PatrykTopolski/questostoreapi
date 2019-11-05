package com.codecool.questostoreapi.service;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.models.users.Mentor;
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
        createArtifacts();
        createMentor();
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

    public void createMentor(){
        mentorRepo.save(new Mentor("MarcinLogin", "haslo", "Marcin", "Izworska", "000-999-888", "marcin@codecool.com", "ul. grodzak 1, kraków"));
        mentorRepo.save(new Mentor("MateuszLogin", "haslo", "Mateusz", "Ostafi", "000-999-999", "mateusz@codecool.com", "ul. grodzak 2, kraków"));
        mentorRepo.save(new Mentor("DominikLogin", "haslo", "Dominik", "Starzyki", "000-888-888", "dominik@codecool.com", "ul. grodzak 3, kraków"));
        mentorRepo.save(new Mentor("PiotrLogin", "haslo", "Piotr", "Leniu", "999-999-888", "piotr@codecool.com", "ul. grodzak 4, kraków"));
        mentorRepo.save(new Mentor("AgaLogin", "haslo", "Agnieszka", "Jakas", "777-999-888", "agu@codecool.com", "ul. grodzak 5, kraków"));
        mentorRepo.save(new Mentor("RafałLogin", "haslo", "Rafał", "Niewiem", "666-999-888", "mrafał@codecool.com", "ul. grodzak 6, kraków"));
    };
}
