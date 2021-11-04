package modulo4.Aula32.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modulo4.Aula32.model.BaseModel;


public  class BaseDao <T extends BaseModel> implements IDao<T>{
    private String filename;

    protected BaseDao(String filename){
        this.filename = filename;
    }

    public void save(T model){
        try{
        FileWriter fw = new FileWriter(filename, true);
        fw.write(model.toString());
        fw.write("\n");
        fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void update(T modelk){
        
    }
    public void remove(T model){
        ArrayList<String> listLinhas = new ArrayList<String>();

        try{
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                int id = Integer.parseInt(linha.split(";")[0]);
                if(id != model.id){
                    listLinhas.add(linha);
                }
                //alterar
                if(id == model.id){
                    listLinhas.add(model.toString());
                }
                else{
                    listLinhas.add(linha);
                }
            }
            FileWriter fw = new FileWriter(filename);
            for ( String l: listLinhas) {
                fw.write(l);
            }
            fw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
