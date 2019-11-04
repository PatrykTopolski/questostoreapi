package com.codecool.questostoreapi.repositories;

import com.codecool.questostoreapi.models.items.Quest;
import org.springframework.data.repository.CrudRepository;

public interface QuestRepository extends CrudRepository<Quest, Integer> {
}
