package com.darkdevil.springcache.controller;

import com.darkdevil.springcache.model.Tutorial;
import com.darkdevil.springcache.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialController {

    // Refer to document
    // https://howtodoinjava.com/spring-boot2/spring-boot-cache-example/
    // https://www.javatpoint.com/spring-boot-caching
    // https://www.baeldung.com/spring-cache-tutorial

    @Autowired
    private TutorialService tutorialService;

    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    @GetMapping("tutorials")
    public List<Tutorial> findAllTutorials(){
        return tutorialService.listAllTutorials();
    }

    @GetMapping("tutorials/{id}")
    public Tutorial findTutorialById(@PathVariable int id){
        return tutorialService.getTutorialById(id);
    }
}
