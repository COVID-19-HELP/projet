package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Temoignage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemoignageRepository extends MongoRepository<Temoignage, String>, PagingAndSortingRepository<Temoignage, String> {
}
