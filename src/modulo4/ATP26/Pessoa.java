package modulo4.ATP26;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public String idade;

    @Override
    public String toString(){
        this.nome +  "," + this.sobrenome + "," + this.idade;
    }
}
