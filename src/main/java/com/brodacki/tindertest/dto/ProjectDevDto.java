package com.brodacki.tindertest.dto;

public class ProjectDevDto {

    private  final Integer idDev;
    private  final Integer idProject;

    public Integer getIdDev() {
        return idDev;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public ProjectDevDto(Integer idDev, Integer idProject) {
        this.idDev = idDev;
        this.idProject = idProject;
    }
}
