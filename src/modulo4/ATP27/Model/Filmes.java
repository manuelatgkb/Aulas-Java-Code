package modulo4.ATP27.Model;

public class Filmes{
    public int id;
    public String titulo;
    public int ano;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Filmes){
            Filmes outro = (Filmes)obj;
            if(this.id == outro.id){
                return true;
            }
        }
            return false;
    }

    @Override
    public String toString() {
        String retorno = Integer.toString(id);
        return retorno;
    }

}
