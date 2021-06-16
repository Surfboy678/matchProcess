package com.brodacki.tindertest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "devs")
public class Dev {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String content;

  @OneToMany
  private List<DevProject> devProjects;

  public Dev() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<DevProject> getDevProjects() {
    return devProjects;
  }

  public void setDevProjects(List<DevProject> devProjects) {
    this.devProjects = devProjects;
  }
}


