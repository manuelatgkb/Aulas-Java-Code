package modulo3.aula14;

public class PessoaFisica extends Pessoa{
    private String rg;
    private String cpf;

    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return rg;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
}
