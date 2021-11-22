package com.capgemini.atp54.models;

public class Produto {
    private String nome;
    private float valor;
    private int id_categoria;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public int getId_categoria() {
        return id_categoria;
    }

}
