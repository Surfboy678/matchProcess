package com.brodacki.tindertest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectDev {

    @Id
    Integer id;
    Integer idDev;
    Integer idProject;

    public ProjectDev() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdDev() {
        return idDev;
    }

    public void setIdDev(Integer idDev) {
        this.idDev = idDev;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }
}
