package com.codecool.questostoreapi.repositories;

import com.codecool.questostoreapi.models.users.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    public Mentor getById(Integer id);

    default boolean exists(Integer id) throws EntityNotFoundException {
        if (existsById(id) == false) {
            throw new EntityNotFoundException("mentor wasn;t found");
        } else return true;
    }

    public boolean existsById(Integer id);

    };


