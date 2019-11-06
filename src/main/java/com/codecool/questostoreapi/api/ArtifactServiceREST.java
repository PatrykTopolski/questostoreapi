package com.codecool.questostoreapi.api;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.repositories.ArtifactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ArtifactServiceREST {
    @Autowired
    private ArtifactRepository artifactRepo;

    @GetMapping("/api/artifact")
    public List<Artifact> getAllArtifacts(){
        return artifactRepo.findAll();
    }

    @GetMapping("/api/artifact/{artifactId}")
    public Artifact getArtifactById(@PathVariable String artifactId){
        return artifactRepo.getArtifactById(Integer.parseInt(artifactId));
    }

    @PostMapping("api/artifact")
    Artifact newArtifact(@RequestBody Artifact newArtifact){
        return artifactRepo.save(newArtifact);
        }

    @DeleteMapping("/api/artifact/{id}")
    void deleteArtifact(@PathVariable int id){
        artifactRepo.deleteById(id);
        }

    @PutMapping("/api/artifact/{id}")
    Artifact updateArtifact(@RequestBody Artifact updatedArtif, @PathVariable int id){
        return artifactRepo.findById(id)
                .map(artifact -> {
                artifact.setName(updatedArtif.getName());
                artifact.setDescription(updatedArtif.getDescription());
                artifact.setPrice(updatedArtif.getPrice());
                artifact.setStudents(updatedArtif.getStudents());
                return artifactRepo.save(artifact);
                })
                .orElseGet(()->{
                    updatedArtif.setId(id);
                    return artifactRepo.save(updatedArtif);
                });

        }

}
