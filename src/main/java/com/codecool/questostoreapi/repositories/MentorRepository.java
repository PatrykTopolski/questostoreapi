package com.codecool.questostoreapi.repositories;

import com.codecool.questostoreapi.models.users.Mentor;
import com.codecool.questostoreapi.models.users.Student;
import com.google.gson.Gson;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;


public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    public Mentor getById(Integer id);

    default Set<Student> getStudentsFromList(HttpServletRequest request) {
        StringBuilder jsonBuff = new StringBuilder();
        String line = null;
        try {
            BufferedReader bodyReader = request.getReader();
            while ((line = bodyReader.readLine()) != null)
                jsonBuff.append(line);
        } catch (Exception e) {
            e.printStackTrace();
            //throw new IOException("Error parsing JSON ");
        }

        String jsonBuffStr = jsonBuff.toString();
        Gson gson = new Gson();
        Mentor mentor = gson.fromJson(jsonBuffStr, Mentor.class);
        Set<Student> students = mentor.getStudents();
        return students;
    }

    }


