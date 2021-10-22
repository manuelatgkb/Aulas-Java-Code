package modulo4.ATP29.Controller;

import java.util.ArrayList;

public class BaseController<D> {
    private ArrayList<D> dados;

    public BaseController(){
    this.dados = new ArrayList<D>();
    }

    //criando o crud

    //create
    public void create(D obj){
        dados.add(obj);
    }

    //read
    public ArrayList<D> read(){
        return this.dados;
    }

    //update
    public void update(D obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    //delete
    public void delete(D obj) {
            this.dados.remove(obj);
    }


    //Validando antes de deletar
    public boolean existe(D obj){
        return this.dados.contains(obj);
    }

}
