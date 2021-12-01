package com.capgemnini.manu.Filmes.api;

import java.util.List;

import com.capgemnini.manu.Filmes.model.Filme;
import com.capgemnini.manu.Filmes.repository.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //para o formato json
@RequestMapping("/api/filme")
public class FilmeApi {

    @Autowired
    private FilmeRepository repository;

    @GetMapping
    public List<Filme>filme(String nome){
        if(nome !=null){
            return (List<Filme>)repository.findByNome(nome);
        }
        return(List<Filme>)repository.findAll();

        //return (List<Filme>)repository.findAll(Sort.by(Sort.BY.Direction.ASC, "id"));
        }

    @PostMapping
    public String salvar(@RequestBody Filme model){ /* não precisa criar um model do tipo Filme, ele faz automaticamnte, mas precisa usar extamente os mesmos nomes dos atributos da classe Filme */
        repository.save(model);
        return "Salvo com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        repository.deleteById(id);
        return "Deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public String update(@RequestBody Filme model, @PathVariable int id){
        if(model.getId() == id){
            repository.save(model);
            return "Update realizado com sucesso!";
        }
        return "id da url diferente do body";
    }
}

