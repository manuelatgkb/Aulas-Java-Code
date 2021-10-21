package modulo4.ATP28.Model;

public class PessoaJuridica extends Pessoa{
    public String endereco;
    public String cnpj;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PessoaJuridica){
            PessoaJuridica outro = (PessoaJuridica)obj;
            if(this.id == outro.id){
                return true;
            }
        }
            return false;
    }

    @Override
    public String toString() {
        return "cnpf" + this.cnpj + "cidade" + this.enderecoCom.cidade; 
    }
}
