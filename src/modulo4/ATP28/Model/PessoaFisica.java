package modulo4.ATP28.Model;

public class PessoaFisica extends Pessoa{
    public String endereco;
    public String cpf;

    
    @Override
    public String toString() {
        return "cpf" + this.cpf + "endereço" + this.enderecoRes.logradouro; 
    }
}
