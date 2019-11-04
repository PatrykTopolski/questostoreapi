package com.codecool.questostoreapi.models.users;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

public class Mentor  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy = "Mentor")
    private Set<Student> students;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;
    private String address;



}
