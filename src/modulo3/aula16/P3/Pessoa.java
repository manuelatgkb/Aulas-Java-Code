package modulo3.aula16.P3;

public class Pessoa {
    private String nome; 
    private String sobrenome; 

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }

    @Override
        public String toString(){
            String objetoEmString = this.nome + " " + this.sobrenome;
            return objetoEmString;
        
    }

}
