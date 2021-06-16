package com.brodacki.tindertest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String description;

    @OneToMany
    private List<ProjectDev> projectDevs;

    public Project() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProjectDev> getProjectDevs() {
        return projectDevs;
    }

    public void setProjectDevs(List<ProjectDev> projectDevs) {
        this.projectDevs = projectDevs;
    }
}
