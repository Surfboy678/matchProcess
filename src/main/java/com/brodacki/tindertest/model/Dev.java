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

  @OneToOne
  private TableToMatch tableToMatch;



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

  public TableToMatch getTableToMatch() {
    return tableToMatch;
  }

  public void setTableToMatch(TableToMatch tableToMatch) {
    this.tableToMatch = tableToMatch;
  }
}


