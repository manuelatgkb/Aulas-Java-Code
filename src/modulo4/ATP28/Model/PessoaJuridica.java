package modulo4.ATP28.Model;

public class PessoaJuridica extends Pessoa{
    public String endereco;
    public String cnpj;


    @Override
    public String toString() {
        return "cnpf" + this.cnpj + "cidade" + this.enderecoCom.cidade; 
    }
}
