package com.covid19help.projet.repository;

import com.covid19help.projet.entity.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends MongoRepository<Utilisateur, String>, PagingAndSortingRepository<Utilisateur, String> {

}
