package com.codecool.questostoreapi.api;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.repositories.ArtifactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ArtifactServiceREST {
    @Autowired
    private ArtifactRepository artifactRepo;

//    public ArtifactServiceREST(ArtifactRepository artifactRepo){
//        this.artifactRepo = artifactRepo;
//    };

    @GetMapping("/api/artifact")
    public List<Artifact> getAllArtifacts(){
        return artifactRepo.findAll();
    }

    @GetMapping("/api/artifact/{artifactId}")
    public Artifact getArtifactById(@PathVariable String artifactId){
        return artifactRepo.getArtifactById(Integer.valueOf(artifactId));
    }

    @PostMapping("api/artifact")
    Artifact newArtifact(@RequestBody Artifact newArtifact){
        return artifactRepo.save(newArtifact);
        }

    @DeleteMapping("/api/artifact/{id}")
    void deleteArtifact(@PathVariable int id){
        artifactRepo.deleteById(id);
        }

}
