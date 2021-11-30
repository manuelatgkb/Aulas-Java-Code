package com.capgemnini.manu.Filmes.api;
import com.capgemnini.manu.Filmes.model.Filme;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import repository.FilmeRepository;


@RestController  
public class FilmesApi {

    @Autowired
    private FilmeRepository repository;

    @GetMapping("/api/filme")
    public String filmes(model req){
        List<Filme> lista = (List<Filme>)Repository.findAll();
        return lista;
    }
    
    @PostMapping("/filmes/salva")
    public String salvar(@RequestBody Filme model){
        repository.save(model);
        return "salvo com sucesso";
    }
}
