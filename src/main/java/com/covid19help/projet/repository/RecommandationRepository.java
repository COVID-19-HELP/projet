package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Recommandation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommandationRepository extends MongoRepository<Recommandation, String>, PagingAndSortingRepository<Recommandation, String> {
}
