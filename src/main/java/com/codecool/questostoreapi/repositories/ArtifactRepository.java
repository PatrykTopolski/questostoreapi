package com.codecool.questostoreapi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.codecool.questostoreapi.models.items.Artifact;

public interface ArtifactRepository extends CrudRepository<Artifact, Integer> {


}
