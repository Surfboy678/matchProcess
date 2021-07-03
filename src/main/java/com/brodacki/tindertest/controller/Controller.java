package com.brodacki.tindertest.controller;


import com.brodacki.tindertest.model.Dev;
import com.brodacki.tindertest.model.Project;
import com.brodacki.tindertest.model.TableToMatch;
import com.brodacki.tindertest.repository.DevRepository;
import com.brodacki.tindertest.repository.ProjectRepository;
import com.brodacki.tindertest.repository.TableToMatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping
public class Controller {

    private DevRepository devRepository;

    private ProjectRepository projectRepository;

    private TableToMatchRepository tableToMatchRepository;


    @Autowired
    public Controller(DevRepository devRepository, ProjectRepository projectRepository, TableToMatchRepository tableToMatchRepository) {
        this.devRepository = devRepository;
        this.projectRepository = projectRepository;
        this.tableToMatchRepository = tableToMatchRepository;
    }

    @PostMapping("/addDev")
    public void addDev(@RequestBody Dev dev){
        devRepository.save(dev);
    }

    @PostMapping("/addProject")
    public void  addProject(@RequestBody Project project){
        projectRepository.save(project);
    }

    @PostMapping("/addLikeForProject/{idDev}/{idProject}")
    public void addDevToMatch(@PathVariable Integer idDev, @PathVariable Integer idProject){
        try{
            Integer getIdDevFromTableToMatch = tableToMatchRepository.findByDevId(idDev).getDevId();
            Integer getIdProjectFromTableMatch = tableToMatchRepository.findProjectIdByDevId(idDev).getProjectId();

            if(getIdDevFromTableToMatch == idDev & getIdProjectFromTableMatch == idProject){
                System.out.println("rekord już istnieje");
            }

    } catch (NullPointerException e) {

            TableToMatch tableToMatch = new TableToMatch();
            tableToMatch.setProjectId(idProject);
            tableToMatch.setDevId(idDev);
            tableToMatchRepository.save(tableToMatch);
        }

    }
}
