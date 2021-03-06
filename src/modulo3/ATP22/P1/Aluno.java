package modulo3.ATP22.P1;

public class Aluno {
   private String nome; 
   private String sobrenome;
   private int idade;
   private double matricula;

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
   public void setIdade(int idade) {
       this.idade = idade;
   }
   public int getIdade() {
       return this.idade;
   }
   public void setMatricula(double matricula) {
       this.matricula = matricula;
   }
   public double getMatricula() {
       return this.matricula;
   }
   @Override
        public String toString(){
            String objetoEmString = this.nome + " " + this.sobrenome + " " + this.idade + " " + this.matricula;
            return objetoEmString;
    }
}
