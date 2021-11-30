package com.capgemnini.manu.Filmes.model;

import java.io.ObjectInputStream.GetField;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Getter @Setter
    private String nome;
    
    @Getter @Setter
    private String nomeDiretor;

    @Getter @Setter
    private String genero;

}
