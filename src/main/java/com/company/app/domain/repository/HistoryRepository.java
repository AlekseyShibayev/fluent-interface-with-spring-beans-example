package com.company.app.domain.repository;

import com.company.app.domain.entity.History;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoryRepository extends CrudRepository<History, Long> {

    @Override
    List<History> findAll();

}
