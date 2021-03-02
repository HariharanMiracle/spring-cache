package com.darkdevil.springcache.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="tutorialsdata")
public class Tutorial {
    @Id
    private int id;
    private String tutorial_author;
    private String tutorial_title;
    private String submission_date;
}
