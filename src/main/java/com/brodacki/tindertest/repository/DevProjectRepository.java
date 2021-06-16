package com.brodacki.tindertest.repository;

import com.brodacki.tindertest.model.DevProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevProjectRepository extends JpaRepository<DevProject, Integer> {
}
