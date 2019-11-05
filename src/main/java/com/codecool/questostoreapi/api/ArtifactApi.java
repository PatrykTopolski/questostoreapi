package com.codecool.questostoreapi.api;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.repositories.ArtifactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtifactApi {
    @Autowired
    private ArtifactRepository artifactRepo;

    @GetMapping("api/artifact")
    public List<Artifact> getAllArtifacts(){
        return (List<Artifact>) artifactRepo.findAll();
    }
    @GetMapping("api/artifact/{artifactId}")
    public Artifact getArtifactById(@PathVariable String artifactId){
        return artifactRepo.getArtifactById(Integer.valueOf(artifactId));
    }
}
