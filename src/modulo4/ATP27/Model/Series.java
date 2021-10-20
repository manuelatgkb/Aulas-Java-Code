package modulo4.ATP27.Model;

public class Series{
    public int id;
    public String temporadas;
    public String titulo;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Series){
            Series outraSerie = (Series)obj;
            if(this.id == outraSerie.id){
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
