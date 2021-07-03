package com.brodacki.tindertest.model;

import javax.persistence.*;

@Entity
@Table(name = "teble_to_matches")
public class TableToMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer devId;

    private Integer projectId;

    public TableToMatch() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "TableToMatch{" +
                "id=" + id +
                ", devId=" + devId +
                ", projectId=" + projectId +
                '}';
    }
}
