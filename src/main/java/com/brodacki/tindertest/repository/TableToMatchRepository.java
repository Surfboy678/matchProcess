package com.brodacki.tindertest.repository;

import com.brodacki.tindertest.model.TableToMatch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TableToMatchRepository extends JpaRepository<TableToMatch, Integer> {

    TableToMatch findByDevId(Integer idDev);

    TableToMatch findProjectIdByDevId(Integer idDev);

    @Override
    boolean existsById(Integer idDev);

    List<TableToMatch> getAllByDevId(Integer idDev);

   TableToMatch findByDevIdAndProjectId(Integer idDev, Integer idProject);


}
