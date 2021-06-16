package com.brodacki.tindertest.repository;

import com.brodacki.tindertest.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
