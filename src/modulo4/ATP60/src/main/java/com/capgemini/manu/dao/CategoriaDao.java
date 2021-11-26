package com.capgemini.manu.dao;

// 60- Utilize como base o projeto criado durante a ATP59.
//Adicione uma camada dao ao projeto e crie nela uma classe CategoriaDao.
//Refatore o projeto para extrair a lógica de create e read da App e colocar na CategoriaDAO.
//Adicione os métodos de update e delete em CategoriaDao.
//Teste na App todos os metodos de crud da CategoriaDao.

//61- _  Utilize como base o projeto criado durante a ATP60.
//Adicione na camada dao uma classe Factory para abstrair a criacao do EntityManager.
//Altere o persistence.xml para refletir as alterações das entidades .
//<property name="hibernate.hbm2ddl.auto" value="update"/> 
//Crie uma nova classe de modelo para mapear uma nova tabela no banco de dados.
//Crie uma classe dao para o novo modelo.
//Teste as operações de crud para este novo modelo.



import java.util.List;

import javax.persistence.EntityManager;

import com.capgemini.manu.model.Categoria;

public class CategoriaDao {
    private EntityManager entityManager;
    
    public CategoriaDao(){
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
       // this.entityManager = factory.createEntityManager();
       this.entityManager = new ConnectionFactory().getConnection();
    }
    
    public int create(Categoria model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
        return model.getId();

    }

    public List<Categoria> read(){
        return this.entityManager
        .createQuery("SELECT c FROM Categoria c", Categoria.class)
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
