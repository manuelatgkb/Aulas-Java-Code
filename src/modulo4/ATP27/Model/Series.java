package modulo4.ATP27.Model;

public class Series extends Filmes{
    public int id;
    public String temporadas;

    @Override
    public String toString() {
        String retorno = Integer.toString(id);
        return retorno;
    }
}
