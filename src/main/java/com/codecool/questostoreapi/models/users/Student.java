package com.codecool.questostoreapi.models.users;

import com.codecool.questostoreapi.models.items.Artifact;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")
@SecondaryTable(name = "student_personals")
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amountOfCoins;
    private int lvlOfExp;
    private String login;
    private String password;
    @Column(table = "student_personals")
    private String firstName;
    @Column(table = "student_personals")
    private String lastName;
    @Column(table = "student_personals")
    private String phoneNum;
    @Column(table = "student_personals")
    private String email;
    @Column(table = "student_personals")
    private String address;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    private List<Artifact> artifacts;


    public void setArtifacts(List<Artifact> artifacts) { this.artifacts = artifacts; }

    public List<Artifact> getArtifacts() { return artifacts; }

    protected  Student() {
    }

    public Student(int amountOfCoins, int lvlOfExp, String login, String password, String firstName, String lastName, String phoneNum, String email, String address) {
        this.amountOfCoins = amountOfCoins;
        this.lvlOfExp = lvlOfExp;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
    }

    public void addArtifact(Artifact artifact){
        artifacts.add(artifact);
    }
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
