package modulo3.ATP19;

public class PessoaFisica {
    private int codigo = 0;
    private String nome = " ";
    private String sobrenome = " ";
    private int idade = 0;
    private int rg = 0;
    private int cpf = 0;


    public int setCodigo (int codigo){
        if(codigo.length()>2){
        this.codigo = codigo;
    }
    public int getCodigo(){
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
        public int setIdade (int idade){
            if(idade>2){
            this.idade = idade;
        }
        public int getIdade(){
            return this.idade;
            }
        
        public int setRg (int rg){
            if(rg.length()8){
            this.rg = rg;
        }
        public int getRg(){
            return this.rg;
            }
        public int setCPF (int cpf){
            if(cpf.length()>11){
            this.cpf = cpf;
        }
        public int getCPF(){
            return this.cpf;
            }

}
