package com.codecool.questostoreapi.service;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.models.users.Mentor;
import com.codecool.questostoreapi.models.users.Student;
import com.codecool.questostoreapi.repositories.ArtifactRepository;
import com.codecool.questostoreapi.repositories.MentorRepository;
import com.codecool.questostoreapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class InitializerBean {

    @Autowired
    ArtifactRepository artifactRepo;
    @Autowired
    StudentRepository studentRepo;
    @Autowired
    MentorRepository mentorRepo;
    @Autowired
    StudentRepository sr;

    public InitializerBean(){
        createArtifacts();
        createMentor();
        createStudents();
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

    public void createStudents(){
        sr.save(new Student(50,5, "student", "student", "marek", "ziomek", "544032056", "student@student", "gdzies tam 15/4" ));
        sr.save(new Student(43,3, "gdyrye", "hasło2", "kuba", "random", "456789123", "next@mail", "somewhere 58/1" ));
        sr.save(new Student(76,1, "student10", "passowrd8", "gregory", "marier", "543876098", "random@mail", "bohemia 33/4" ));
    }

    private void getAllStudentsSet(){
        List<Student> students = new ArrayList<>();
        sr.findAll().forEach(students::add);
        Set<Student> studentsSet = new HashSet<>(students);
    }


}
