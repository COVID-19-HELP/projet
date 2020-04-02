package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends MongoRepository<Produit, String>, PagingAndSortingRepository<Produit, String> {
}
