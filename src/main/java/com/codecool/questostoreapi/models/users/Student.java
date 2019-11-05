package com.codecool.questostoreapi.models.users;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.models.items.Quest;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
@SecondaryTable(name = "Personals")
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amountOfCoins;
    private int lvlOfExp;
    private String login;
    private String password;
    @Column(table = "Personals")
    private String firstName;
    @Column(table = "Personals")
    private String lastName;
    @Column(table = "Personals")
    private String phoneNum;
    @Column(table = "Personals")
    private String email;
    @Column(table = "Personals")
    private String address;
    @ManyToMany(mappedBy = "students")
    List<Artifact> artifacts;

    public Student(){};

    public void setArtifacts(List<Artifact> artifacts) { this.artifacts = artifacts; }

    public List<Artifact> getArtifacts() { return artifacts; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountOfCoins() {
        return amountOfCoins;
    }

    public void setAmountOfCoins(int amountOfCoins) {
        this.amountOfCoins = amountOfCoins;
    }

    public int getLvlOfExp() {
        return lvlOfExp;
    }

    public void setLvlOfExp(int lvlOfExp) {
        this.lvlOfExp = lvlOfExp;
    }

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
