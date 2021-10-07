package modulo3.aula16.P1;

public class Pessoa{
    private String nome;
    private String sobrenome;

    public void setNome(String nome){
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

    @Override
    public String toString() {
        String mensagem ="Classe Pessoa - " + this.nome + " " + this.sobrenome;
        return mensagem;
    }
}