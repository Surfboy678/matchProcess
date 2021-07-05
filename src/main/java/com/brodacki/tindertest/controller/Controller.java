package com.brodacki.tindertest.controller;

import com.brodacki.tindertest.model.Dev;
import com.brodacki.tindertest.model.Project;
import com.brodacki.tindertest.dto.ProjectDevDto;
import com.brodacki.tindertest.model.TableToMatch;
import com.brodacki.tindertest.repository.DevRepository;
import com.brodacki.tindertest.repository.ProjectRepository;
import com.brodacki.tindertest.repository.TableToMatchRepository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class Controller {

  private Logger logger;

  private DevRepository devRepository;

  private ProjectRepository projectRepository;

  private TableToMatchRepository tableToMatchRepository;

  @Autowired
  public Controller(
      DevRepository devRepository,
      ProjectRepository projectRepository,
      TableToMatchRepository tableToMatchRepository) {
    this.devRepository = devRepository;
    this.projectRepository = projectRepository;
    this.tableToMatchRepository = tableToMatchRepository;
  }

  @PostMapping("/addDev")
  public void addDev(@RequestBody Dev dev) {
    devRepository.save(dev);
  }

  @PostMapping("/addProject")
  public void addProject(@RequestBody Project project) {
    projectRepository.save(project);
  }

  @PostMapping("/addLikeForProject")
  public String addDevToMatch(@RequestBody ProjectDevDto projectDevDto) {

    Integer devId = projectDevDto.getIdDev();

    Integer prjId = projectDevDto.getIdProject();

    if (devId == null || prjId == null) {

      ResponseEntity responseEntity =
          new ResponseEntity("podano puste dane. Spróbuj ponownie", HttpStatus.BAD_REQUEST);
      return responseEntity.getBody().toString();
    }

    Optional<TableToMatch> tableToMatchOptional =
        tableToMatchRepository.findByDevIdAndProjectId(devId, prjId);

    if (tableToMatchOptional.isPresent()) {
      TableToMatch tableToMatch = tableToMatchOptional.get();
      tableToMatch.setMatch(true);
      tableToMatchRepository.save(tableToMatch);
      return "Pomyślnie zmodyfikowano";

    } else {

      TableToMatch tableToMatch = new TableToMatch();
      tableToMatchRepository.save(tableToMatch);
      return "Pomyślnie zapisano";
    }
  }

  @GetMapping("/getMatchById/{idMatch}")
  public TableToMatch getMatchById(@PathVariable Integer idMatch){
    return tableToMatchRepository.getById(idMatch);
  }
}
