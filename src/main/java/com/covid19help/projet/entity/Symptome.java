package com.covid19help.projet.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Symptome extends Model{
    @Id
    private String id;
}
