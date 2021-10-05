package modulo3.ATP19;

public class PessoaFisica {
    private String codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;
    private String cpf;


    public void setCodigo (String codigo){
        if(codigo.length()>2){
        this.codigo = codigo;
    }
}
    public String getCodigo(){
        return codigo;
        }

    public void setNome(String nome){
        if(nome.length()>2){
        this.nome = nome;
            }
        }
        public String getNome(){
            return nome;
            
        }
        public void setSobrenome(String sobrenome){
            if(sobrenome.length()>2){
            this.sobrenome = sobrenome;
            }
        }
        public String getSobrenome(){
            return sobrenome;
            }
        public void setIdade(int idade) {
            this.idade  = idade;
        }
        public int getIdade(){
            return idade;
        }
        
        public void setRg (String rg){
            this.rg = rg;
        }
        public String getRg(){
            return rg;
        }
        public void setCPF (String cpf){
            if(cpf.length()>11){
            this.cpf = cpf;
        }
    }
        public String getCPF(){
            return cpf;
        }

}
