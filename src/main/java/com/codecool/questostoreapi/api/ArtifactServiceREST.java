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

    private ArtifactRepository artifactRepo;

    ArtifactServiceREST(ArtifactRepository artifactRepo){
        this.artifactRepo = artifactRepo;
    }


    @GetMapping("/api/artifact")
    public List<Artifact> getAllArtifacts(){
        return artifactRepo.findAll();
    }

    @GetMapping("/api/artifact/{artifactId}")
    public Artifact getArtifactById(@PathVariable String artifactId){
        return artifactRepo.getArtifactById(Integer.parseInt(artifactId));
    }

//    @PostMapping("api/artifact")
//    public ResponseEntity<Void> addNewArtifact(@RequestBody Artifact newArtifact){
//        Artifact artifact = artifactRepo.add(newArtifact);
//        if(newArtifact==null)
//            return ResponseEntity.noContent().build();
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
//                .buildAndExpand(artifact.getId()).toUri();
//        return ResponseEntity.created(location).build();
//    }
}
