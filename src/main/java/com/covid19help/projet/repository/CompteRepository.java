package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Compte;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends MongoRepository<Compte, String>, PagingAndSortingRepository<Compte, String> {
}
