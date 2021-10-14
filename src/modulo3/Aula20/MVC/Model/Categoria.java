package modulo3.Aula20.MVC.Model;

public class Categoria extends BaseModel{
    public String nome;
    public String descricao;

    public BaseModel(){
        this.id = 1++;
    }
    public int getId(){
        return id;
    }
}
