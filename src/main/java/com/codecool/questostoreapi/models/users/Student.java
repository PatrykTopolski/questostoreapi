package com.codecool.questostoreapi.models.users;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.models.items.Quest;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amountOfCoins;
    private int lvlOfExp;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;
    private String address;

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getAmountOfCoins() {
        return amountOfCoins;
    }

    public void setAmountOfCoins(int amountOfCoins) {
        this.amountOfCoins = amountOfCoins;
    }

    @Override
    public int getLvlOfExp() {
        return lvlOfExp;
    }

    public void setLvlOfExp(int lvlOfExp) {
        this.lvlOfExp = lvlOfExp;
    }
}
