package com.codecool.questostoreapi.models.users;

import java.util.List;

public class Admin extends User {
    private List<Mentor> mentorList;
    private List<Student> studentList;
    private List<Integer> listOfLevels;


    public Admin (int user_id, String login, String password, String userType){
        setId(user_id);
        setLogin(login);
        setPassword(password);
        setUserType(userType);
    }


    public  Admin(int user_id, String  login,String password,String firstName,String lastName,String phoneNumber,String email,String address){
        setId(user_id);
        setLogin(login);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNum(phoneNumber);
        setEmail(email);
        setAddress(address);
    }

    public List<Mentor> getMentorList() {
        return mentorList;
    }


    public List<Student> getStudentList() {
        return studentList;

    }

    public List<Integer> getListOfLevels() {
        return listOfLevels;
    }
}
