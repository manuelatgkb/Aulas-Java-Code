package modulo3.ATP20;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private double matricula;

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

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
    public double getMatricula() {
        return matricula;
    }

}
