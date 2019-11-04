package com.codecool.questostoreapi.repositories;

import com.codecool.questostoreapi.models.users.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
}
