package com.codecool.questostoreapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codecool.questostoreapi.models.items.Artifact;

public interface ArtifactRepository extends JpaRepository<Artifact, Integer> {

    public Artifact getArtifactById(int id);
    public Artifact add(Artifact artifact);


}
