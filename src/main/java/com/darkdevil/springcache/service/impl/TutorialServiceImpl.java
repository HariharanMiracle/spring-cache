package com.darkdevil.springcache.service.impl;

import com.darkdevil.springcache.model.Tutorial;
import com.darkdevil.springcache.repository.TutorialRepository;
import com.darkdevil.springcache.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames={"tuorial"})
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> listAllTutorials() {
        List<Tutorial> tutorialList = (List<Tutorial>) tutorialRepository.findAll();
        return tutorialList;
    }

    @Override
    @Cacheable("tutorial")
    public Tutorial getTutorialById(int id) {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        Tutorial tutorial = tutorialRepository.findById(id).get();
        return tutorial;
    }
}
