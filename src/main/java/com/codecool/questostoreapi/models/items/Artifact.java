package com.codecool.questostoreapi.models.items;

import com.codecool.questostoreapi.models.users.Student;

import javax.persistence.*;
import java.util.List;

@Entity
public class Artifact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private int price;
    @ManyToMany()
    private List<Student> students;

    protected Artifact() {}

    public Artifact(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setId(int id) { this.id = id; }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

}
