package modulo4.ATP26;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public String idade;

    @Override
    public boolean equals(Object obj){
        Pessoa outraPessoa = (Pessoa)obj;
        if( this.nome.equals(outraPessoa.nome) && this.sobrenome.equals(outraPessoa.sobrenome)&& this.idade.equals(outraPessoa.idade)){
            return true;
        }
        return false;

    @Override
    public String toString(){
        this.nome +  "," + this.sobrenome + "," + this.idade;
    }
}
