package com.example.demo.repo;

import com.example.demo.entity.Drug;
import org.springframework.data.repository.CrudRepository;

public interface DrugRepository extends CrudRepository<Drug, Integer> {
    Drug findByName(String name);

}

