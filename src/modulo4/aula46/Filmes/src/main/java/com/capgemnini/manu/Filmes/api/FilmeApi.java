package com.capgemnini.manu.Filmes.api;

import java.util.List;

import com.capgemnini.manu.Filmes.model.Filme;
import com.capgemnini.manu.Filmes.repository.FilmeRepository;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeApi {
    private FilmeRepository repository;

    public FilmeApi(FilmeRepository repository){
        this.repository = repository;
    }

    @GetMapping("/api/filme")
    public List<Filme> filme(){
        List<Filme> lista = (List<Filme>)repository.findAll();
        return lista;
    }
}
