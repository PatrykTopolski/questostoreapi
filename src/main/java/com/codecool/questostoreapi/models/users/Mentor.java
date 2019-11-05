package com.codecool.questostoreapi.models.users;

import javax.persistence.*;
import java.util.Set;

// two tables one c.. entity : example
@Entity
@Table(name = "Mentor")
@SecondaryTable(name = "mentor_personals")
public class Mentor  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    @OneToMany(mappedBy = "Mentor")
//    private Set<Student> students;
    private String login;
    private String password;
    @Column(table = "mentor_personals")
    private String firstName;
    @Column(table = "mentor_personals")
    private String lastName;
    @Column(table = "mentor_personals")
    private String phoneNum;
    @Column(table = "mentor_personals")
    private String email;
    @Column(table = "mentor_personals")
    private String address;

    public Mentor(String password, String firstName, String lastName, String phoneNum, String email, String address) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
    }

    protected Mentor(){};


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Set<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(Set<Student> students) {
//        this.students = students;
//    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
