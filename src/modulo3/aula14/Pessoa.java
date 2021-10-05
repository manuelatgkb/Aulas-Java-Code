package modulo3.aula14;

import java.util.Date;

public class Pessoa {
    private int codigo;
    private String nome;
    private Date data_nascimento;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setDataNascimento(Date data_nascimento){
        this.data_nascimento = data_nascimento;
    }
    public Date getDataNascimento(){
        return data_nascimento;
    }
}
