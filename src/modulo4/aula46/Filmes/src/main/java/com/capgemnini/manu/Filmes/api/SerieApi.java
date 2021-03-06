package com.capgemnini.manu.Filmes.api;

import java.util.List;

import com.capgemnini.manu.Filmes.model.Serie;
import com.capgemnini.manu.Filmes.repository.SerieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/serie")
public class SerieApi {

    @Autowired
    private SerieRepository repo;

    @GetMapping
    public List<Serie> list(){
        return (List<Serie>)repo.findAll();
    }

    @PostMapping
    public String create(@RequestBody Serie model){
        repo.save(model);
        return "Salva com sucesso";
    }

    @PutMapping("{/id}")
    public String update(@PathVariable int id, @RequestBody Serie model){
        if(id == model.getId()){
            repo.save(model);
        }return "Alterado com sucesso!";
    }

    @DeleteMapping("{/id}")
    public String delete(@PathVariable int id){
        return "Deletado com sucesso!";
    }
    
}
