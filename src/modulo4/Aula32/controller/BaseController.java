package modulo4.Aula32.controller;

import java.util.ArrayList;

import modulo4.Aula32.dao.BaseDao;
import modulo4.Aula32.model.BaseModel;

public abstract class BaseController<T extends BaseModel> {
    private ArrayList<T> list;
    private BaseDao<T> dao;

    public BaseController(BaseDao dao){
        this.list = new ArrayList<T>();
        this.dao = new BaseDao<T>(filename);
    }

    public void create(T model){
        this.list.add(model);
        this.dao.save(model);
    }

    public ArrayList<T> read(){
        return this.list;
    }
    public void update(T model){
        if(this.list.contains(model)){
            this.delete(model);
            this.create(model);
        }
    }
    public void delete(T model){
        pc.delete(T model);
        this.list.remove(model);
        dao.remove(model);
    }

}
