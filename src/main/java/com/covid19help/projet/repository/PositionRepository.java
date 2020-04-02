package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Position;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends MongoRepository<Position, String>, PagingAndSortingRepository<Position, String> {
}
