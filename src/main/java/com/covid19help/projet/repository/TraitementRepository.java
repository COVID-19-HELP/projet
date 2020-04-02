package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Traitement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitementRepository extends MongoRepository<Traitement, String>, PagingAndSortingRepository<Traitement, String> {
}
