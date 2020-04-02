package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Conseil;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConseilRepository extends MongoRepository<Conseil, String>, PagingAndSortingRepository<Conseil, String> {
}
