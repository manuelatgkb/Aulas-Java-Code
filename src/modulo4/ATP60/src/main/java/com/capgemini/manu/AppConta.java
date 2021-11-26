package com.capgemini.manu;

import com.capgemini.manu.dao.ContaCorrenteDao;
import com.capgemini.manu.model.ContaCorrente;

/**
 * Hello world!
 *
 */
public class AppConta 
{
    public static void main( String[] args )
    {
       ContaCorrenteDao dao = new ContaCorrenteDao();
       ContaCorrente model = new ContaCorrente();
       model.setNome("Conta do Maykon2");
       model.setDescricao("Uma conta do seu jeito!");

       dao.create(model);
    }
}
