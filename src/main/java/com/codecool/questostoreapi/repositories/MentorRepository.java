package com.codecool.questostoreapi.repositories;

import com.codecool.questostoreapi.models.users.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    public Mentor getById(Integer id) throws EntityNotFoundException;

    }


