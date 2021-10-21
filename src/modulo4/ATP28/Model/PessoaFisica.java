package modulo4.ATP28.Model;

public class PessoaFisica extends Pessoa{
    public String endereco;
    public String cpf;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PessoaFisica){
            PessoaFisica outro = (PessoaFisica)obj;
            if(this.id == outro.id){
                return true;
            }
        }
            return false;
    }

    @Override
    public String toString() {
        return "cpf" + this.cpf + "endereço" + this.enderecoRes.logradouro; 
    }
}
