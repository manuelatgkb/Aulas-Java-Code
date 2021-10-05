package modulo3.aula13;

public class Categoria {
   private String nome;
   private String descricao;
   
   public void setNome(String nome){
    if(nome.length()>2){
    this.nome = nome;
        }
    }
    public String getNome(){
        return this.nome;
        
}
    public void setDescricao(String descricao){
        if(descricao.length()>2){
        this.descricao = descricao;
        }
    }
    public String getDescricao(){
        return this.descricao;
        }
    }

