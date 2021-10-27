package modulo4.ATP31.Controller;

import java.util.ArrayList;

public class BaseController <T> {
    public ArrayList<T> lista;

    public BaseController(){
        lista = new ArrayList<T>();
    }
    //CRUD
    //Create 
    public void create(T obj){
        this.lista.add(obj);
    }
    //Read 
    public ArrayList<T> read(){
        return this.lista;
    }
    //Update
    public void update(T obj){
        if(existe(obj)){
            delete(obj);
            create(obj);
        }
    }

    //Delete
    public boolean delete(T obj){
        return this.lista.remove(obj);

    }
    public boolean existe(T obj){
        if(this.lista.contains(obj)){
            return true;
        }
        return false; 
    }

}

