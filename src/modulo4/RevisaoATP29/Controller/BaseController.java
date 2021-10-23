package modulo4.RevisaoATP29.Controller;

import java.util.ArrayList;

public class BaseController <D>{
    private ArrayList <D> dados;

    public BaseController(){
        this.dados = new ArrayList<D>();
    }

    // Criando o CRUD

    //Create
    public void create(D obj){
        dados.add(obj);
    }

    //Read
    public ArrayList<D> read(){
        return this.dados;
    }

    //Update
    public void update(D obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }
    
    //Delete
    public void delete(D obj){
        this.dados.remove(obj);
    }

    // a booleana do update
    public boolean existe(D obj){
        return this.dados.contains(obj);
    }
}
