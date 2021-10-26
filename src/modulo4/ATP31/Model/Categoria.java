package modulo4.ATP31.Model;

public class Categoria extends BaseID{
    public String descricao;

    @Override
    public String toString() {
        return "\n Categoria ID: " + this.id + "\n Categoria: " + descricao;
    }
}
