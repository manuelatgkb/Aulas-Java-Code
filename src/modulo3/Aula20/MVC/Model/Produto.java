package modulo3.Aula20.MVC.Model;

public class Produto {
    private String nome;
    private double valor;
    private String marca;

    public Produto(String nome, double valor, String marca){
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
    }
    
    @Override
    public String toString(){
        return this.nome + "," + this.valor + "," + this.marca;
    }
}
