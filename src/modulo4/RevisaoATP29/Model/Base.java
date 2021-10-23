package modulo4.RevisaoATP29.Model;

public class Base {
    public int id;

    @Override
    public String toString() {
        String retorno = Integer.toString(id); 
        return retorno;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Produtos){
            Produtos outroProduto = (Produtos)obj;
            if(this.id == outroProduto.id){
                return true;
            } 
        } return false; 
    }
}
