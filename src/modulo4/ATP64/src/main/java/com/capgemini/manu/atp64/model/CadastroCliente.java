package model;

public class CadastroCliente(){
    
    private String id;
    private String nome;
    private String sobrenome;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
}