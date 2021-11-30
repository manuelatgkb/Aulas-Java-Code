package com.capgemnini.manu.Filmes.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genero")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;
    
    @Getter @Setter
    private String nome;
    
    @Getter @Setter
    private String nomeDiretor;

    @Getter @Setter
    private String genero;
}
