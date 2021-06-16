package com.brodacki.tindertest.controller;


import com.brodacki.tindertest.model.Dev;
import com.brodacki.tindertest.model.Project;
import com.brodacki.tindertest.repository.DevProjectRepository;
import com.brodacki.tindertest.repository.DevRepository;
import com.brodacki.tindertest.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping
public class Controller {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private DevRepository devRepository;

    @Autowired
    private DevProjectRepository devProjectRepository;

    @PostMapping("/addProject")
    public void addProject(@RequestBody Project project){
        projectRepository.save(project);

    }
    @PostMapping("/addDev")
    public void addDev(@RequestBody Dev dev){
        devRepository.save(dev);
    }
    @RequestMapping("/getProjectById/{idProject}")
    public Optional<Project> getProjectById(@PathVariable Integer idProject){
       return projectRepository.findById(idProject);
    }
    @RequestMapping("/getListProject")
    public List<Project> getListProject(){
         List<Project> allProject = projectRepository.findAll();
         return allProject;
    }
    public void addProjectToDev(Integer idProject){

    }

}
