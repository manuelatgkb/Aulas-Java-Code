package com.capgemini.manu;

import com.capgemini.manu.dao.CategoriaDao;
import com.capgemini.manu.model.Categoria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sistema de banco!" );
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        model.setId(101);
        model.setNome("Testes JPA");

        dao.delete(101);
        

        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        //EntityManager em = factory.createEntityManager();

        //em.getTransaction().begin();
        //em.persist(model);
        //em.getTransaction().commit();

        //List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
        
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n",categoria.getId(),categoria.getNome());
        }
    }
}
