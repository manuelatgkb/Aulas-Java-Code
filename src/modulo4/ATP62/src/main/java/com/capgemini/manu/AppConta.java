package com.capgemini.manu;

import com.capgemini.manu.model.ContaCorrente;
import com.capgemini.manu.repository.ContaCorrenteRepository;

/**
 * Hello world!
 *
 */
public class AppConta 
{
    public static void main( String[] args )
    {
       ContaCorrenteRepository dao = new ContaCorrenteRepository();
       ContaCorrente model = new ContaCorrente();
       model.setNome("Conta do Maykon2");
       model.setDescricao("Uma conta do seu jeito!");

       dao.create(model);
    }
}
