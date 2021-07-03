package com.brodacki.tindertest.repository;

import com.brodacki.tindertest.model.TableToMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableToMatchRepository extends JpaRepository<TableToMatch, Integer> {

    TableToMatch findByDevId(Integer idDev);

    TableToMatch findProjectIdByDevId(Integer idDev);
}
