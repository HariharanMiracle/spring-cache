package com.darkdevil.springcache.service;

import com.darkdevil.springcache.model.Tutorial;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TutorialService {
    public List<Tutorial> listAllTutorials();
    public Tutorial getTutorialById(int id);
}
