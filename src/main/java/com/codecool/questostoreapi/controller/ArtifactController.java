package com.codecool.questostoreapi.controller;

import com.codecool.questostoreapi.models.items.Artifact;
import com.codecool.questostoreapi.repositories.ArtifactRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/artifact")
public class ArtifactController {
    @Autowired
    private ArtifactRepository artifactRepo;
    private Logger logger = Logger.getLogger(ArtifactController.class.getName());

    @GetMapping()
    public List<Artifact> getAllArtifacts(){
        logger.info("get artifact request");
        return artifactRepo.findAll();
    }

    @GetMapping(value = "/{artifactId}")
    public Artifact getArtifactById(@PathVariable String artifactId){
        logger.info("get artifact request");
        return artifactRepo.getArtifactById(Integer.parseInt(artifactId));
    }

    @PostMapping()
    Artifact newArtifact(@RequestBody Artifact newArtifact) {
        logger.info("post artifact request");
        return artifactRepo.save(newArtifact);
    }

    @DeleteMapping(value = "/{id}")
    void deleteArtifact(@PathVariable int id){
        logger.info("delete artifact request");
        artifactRepo.deleteById(id);
    }

    @PutMapping(value = "/{id}")
    Artifact updateArtifact(@RequestBody Artifact updatedArtif, @PathVariable int id){
        logger.info("put artifact request");
        return artifactRepo.findById(id)
                .map(artifact -> {
                artifact.setName(updatedArtif.getName());
                artifact.setDescription(updatedArtif.getDescription());
                artifact.setPrice(updatedArtif.getPrice());
                return artifactRepo.save(artifact);
                })
                .orElseGet(()->{
                    updatedArtif.setId(id);
                    return artifactRepo.save(updatedArtif);
                });
    }

}
