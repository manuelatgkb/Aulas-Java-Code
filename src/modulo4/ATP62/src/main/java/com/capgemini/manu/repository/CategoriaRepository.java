package com.capgemini.manu.repository;

// _  Acesse o site de criação de projetos spring no endereço:  https://start.spring.io/ .
//Crie um projeto com as dependências do Spring JPA e o Driver do Postgres.
//Gere o projeto, descompacte a pasta e cole em repositório GIT. 

//Adicione as configurações de banco de dados no arquivo resources/
//Execute os comandos clean e install do maven.
//Teste a aplicação executando a classe java que já veio com o do projeto.

//Crie uma camada model e adicione a classe model de Clientes. Crie as propriedades que julgar necessário.
// Crie uma camada repository e adicione a interface ClienteRepository que herda de CrudRepository.
// Realize os testes da repository na classe principal da aplicação. Lembre-se de utilizar a injeção de dependências para criação da instância da interface repository.
// Adicione os arquivos da atividade em um repositório GIT. Envie as alterações para o GitHub através dos comandos do GIT. 
// No GitHub, adicione o usuário maykondgranemann, como colaborador.

import java.util.List;

import javax.persistence.EntityManager;

import com.capgemini.manu.model.Categoria;

public class CategoriaRepository extends BaseRepository<Categoria>{
    
    public CategoriaRepository(){
        super(new Categoria());
    }
    
    public List<Categoria>read(){
        return this.getEntityManager()
        .createQuery("SELECT c FROM CATEGORIA c", Categoria.class)
        .getResultList();

    }
}
