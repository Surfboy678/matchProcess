package com.brodacki.tindertest.model;

import javax.persistence.*;


@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String description;

   @OneToOne
   private TableToMatch tableToMatch;



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

    public TableToMatch getTableToMatch() {
        return tableToMatch;
    }

    public void setTableToMatch(TableToMatch tableToMatch) {
        this.tableToMatch = tableToMatch;
    }
}
