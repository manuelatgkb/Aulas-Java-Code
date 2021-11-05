package modulo4.ATP40.dao;

import java.util.ArrayList;

import modulo4.Aula32.dao.IDao;
import modulo4.Aula32.model.BaseModel;

public class BaseController extends BaseModel{
    private ArrayList<T> list;
    private IDao<T> dao;

    public BaseController(IDao<T> dao) {
        this.list = new ArrayList<T>();
        this.dao = dao;
    }

    public void create(T model){
        this.list.add(model);
        this.dao.save(model);
    }
    public ArrayList<Object> read(){        
        return dao.list(); 
    }
    public void update(T model){
        if(this.list.contains(model)){
            this.delete(model);
            this.create(model);
        }

        dao.update(model);
    }
    public void delete(T model){
        this.list.remove(model);
        dao.remove(model);
    }
}
