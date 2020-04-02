package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Symptome;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomeRepository extends MongoRepository<Symptome, String>, PagingAndSortingRepository<Symptome, String> {
}
