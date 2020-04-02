package com.covid19help.projet.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Recommandation extends Model{
    @Id
    private String id;
}
