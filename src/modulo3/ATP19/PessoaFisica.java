package modulo3.ATP19;

public class PessoaFisica {
    private String codigo = " ";
    private String nome = " ";
    private String sobrenome = " ";
    private String idade = " ";
    private String rg = " ";
    private String cpf = " ";


    public String setCodigo (String codigo){
        if(codigo.length()>2){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
        }

    public void setNome(String nome){
        if(nome.length()>2){
        this.nome = nome;
            }
        }
        public String getNome(){
            return this.nome;
            
    }
        public void setSobrenome(String sobrenome){
            if(sobrenome.length()>2){
            this.sobrenome = sobrenome;
            }
        }
        public String getSobrenome(){
            return this.sobrenome;
            }
        public String setIdade(String idade){
            this.idade  = idade;
        }
        public String getIdade(){
            return this.idade;
            }
        
        public String setRg (String rg){
            if(rg.length()>8){
            this.rg = rg;
        }
        public String getRg(){
            return this.rg;
            }
        public String setCPF (String cpf){
            if(cpf.length()>11){
            this.cpf = cpf;
        }
        public String getCPF(){
            return this.cpf;
            }

}
