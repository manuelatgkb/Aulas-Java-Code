package modulo3.ATP18;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    public void setIdade(int codigo){
        if(codigo>2){
        this.codigo = codigo;
        }
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setNome(String nome){
        if(nome.length()>2){
        this.nome = nome;
        }
    }
    public String getNome(){
        return this.nome;
    }
    public void setDescricao(String descricao){
        if(descricao.length()>2){
        this.descricao = descricao;
        }
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setValor(double valor){
        if(valor>0){
        this.valor = valor;
        }
    }
    public double getValor(){
        return this.valor;
    }
}
