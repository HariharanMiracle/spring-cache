package com.darkdevil.springcache.repository;

import com.darkdevil.springcache.model.Tutorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends CrudRepository<Tutorial, Integer> {
}
