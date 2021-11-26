package com.capgemini.manu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import com.capgemini.manu.model.Categoria;
import com.capgemini.manu.model.ContaCorrente;

public class ContaCorrenteDao {
    private EntityManager entityManager;

    public ContaCorrenteDao(){
        this.entityManager = new ConnectionFactory().getConnection();
    }
    
    public int create(Categoria model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
        return model.getId();
    }

    public List<ContaCorrente> read(){
        return this.entityManager
        .createQuery("SELECT cc FROM ContaCorrente cc", ContaCorrente.class)
        .getResultList();

    }

    public void update(Categoria model){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);
        this.entityManager.getTransaction().commit();

    }

    public void delete(int id){
        Categoria model = this.entityManager.find(Categoria.class, id);
        if(model!=null){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(model);
        this.entityManager.getTransaction().commit();
        }
    }
}
