package com.capgemini.manu.repository;

import javax.persistence.EntityManager;

public abstract class BaseRepository<T> {
    
    private EntityManager entityManager;
    private Class classtype;
    public BaseRepository(Class classtype){
        this.class = classtype;
        this.entityManager = new ConnectionFactory().getConnection();

    }

    public void create(T model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
    }

    public EntityManager getEntityManager(){
        return entityManager;
    }

    public void update(T model){
        this.getEntityManager().getTransaction().begin();
        this.getEntityManager().merge(model);
        this.getEntityManager().getTransaction().commit();
    }
    
}
