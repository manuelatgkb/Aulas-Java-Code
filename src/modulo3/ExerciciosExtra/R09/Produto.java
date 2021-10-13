package modulo3.ExerciciosExtra.R09;

import java.util.Random;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    public Produto(){
        this.criaCodigo();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    private void criaCodigo(){
        Random r = new Random();
        this.codigo = r.nextInt(1000);
    }

    @Override
    public String toString(){
        String retorno = "Cod: " + this.codigo
                        + "Nome" + this.nome
                        + "Desc" + this.descricao
                        + "Valor" + this.valor;
        return super.toString();
    }
}
