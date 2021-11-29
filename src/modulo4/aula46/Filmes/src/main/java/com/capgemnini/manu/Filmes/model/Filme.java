package com.capgemnini.manu.Filmes.model;

import java.io.ObjectInputStream.GetField;

public class Filme {
    private String nome;
    private String nomeDiretor;
    private String genero;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
    public String getNomeDiretor() {
        return nomeDiretor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
}
