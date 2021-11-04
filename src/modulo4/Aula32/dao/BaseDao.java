package modulo4.Aula32.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public  class BaseDao <T> implements IDao<T>{
    private String filename;

    protected BaseDao(String filename){
        this.filename = filename;
    }

    public void save(T model){
        try{
        FileWriter fw = new FileWriter(filename, true);
        fw.write(model.toString());
        fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void update(){
        
    }
    public void remove(){
        
    }
}
