package modulo4.ATP28.Controller;

import java.util.ArrayList;

public class BaseController <D> {
    private ArrayList<D> dados;

    public BaseController(){
    this.dados = new ArrayList<D>();
    }
//CRUD
    public void create(D obj){
        dados.add(obj);
    }

    public ArrayList<D> read(){
        return this.dados;
    }
    
    public void update(D obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(D obj){
        this.dados.remove(obj);
    }
//Validando antes de deletar
    public boolean existe(D obj){
        return this.dados.contains(obj);
    }

}
