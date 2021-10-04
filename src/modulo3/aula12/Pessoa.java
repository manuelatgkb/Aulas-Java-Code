package modulo3.aula12;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    public void setNome(String nome){
        if(nome.length()>2){
        this.nome = nome;
        }
    }
    public String getNome(){
        return this.nome;
    }
    public void setSobrenome(String sobrenome){
        if(sobrenome.length()>2){
        this.sobrenome = sobrenome;
        }
    }
    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setIdade(int idade){
        if(idade>0){       
        this.idade = idade;
        }
    }
    public int getIdade(){
        return this.idade;
    }

    public void setCpf(String cpf){
        if(cpf.length()>11){
        this.cpf = cpf;
        }
    }
    public String getCpf(){
        return this.cpf;
    }
}
