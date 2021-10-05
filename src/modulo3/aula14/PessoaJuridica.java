package modulo3.aula14;

public class PessoaJuridica extends Pessoa {
    private String nome_fantasia;
    private String ie;
    private String cnpj;

    public void setNome_fantasia(String nome_fantasia){
        this.nome_fantasia = nome_fantasia;
    }
    private String getNomeFantasia(){
        return nome_fantasia;
    }
    public void setIe(String ie){
        this.ie = ie;
    }
    private String getIe(){
        return ie;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    private String getCnpj(){
        return cnpj;
    }
}
