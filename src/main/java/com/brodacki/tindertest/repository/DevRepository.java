package com.brodacki.tindertest.repository;

import com.brodacki.tindertest.model.Dev;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevRepository extends JpaRepository<Dev, Integer> {
}
