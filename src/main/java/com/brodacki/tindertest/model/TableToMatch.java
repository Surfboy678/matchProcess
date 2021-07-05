package com.brodacki.tindertest.model;

import javax.persistence.*;

@Entity
@Table(name = "teble_to_matches")
public class TableToMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade=CascadeType.ALL)
    private Dev dev;

    @OneToOne(cascade=CascadeType.ALL)
    private Project project;

    boolean isMatch;

    public TableToMatch() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean isMatch() {
        return isMatch;
    }

    public void setMatch(boolean match) {
        isMatch = match;
    }
}
