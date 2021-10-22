package modulo4.ATP29.Model;

public class Produtos extends Base{
    public Categorias categoria;
    public String nome;

    public Produtos(){
        categoria = new Categorias();
    }

    @Override
    public String toString() {
        String retorno = (nome +  "," + categoria.descricao +  "," + categoria.marca + super.toString());
        return retorno;
    }
}
