package com.capgemnini.manu.Filmes.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.capgemnini.manu.Filmes.model.Filme;
import com.capgemnini.manu.Filmes.repository.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmeController {
    private FilmeRepository repository;

    public FilmeController(FilmeRepository repository){ //injeção de dependência
        this.repository = repository;
    }
    
    @GetMapping("/filme")
    public String filme(Model req, String nome){
        List<Filme> lista;
        if(nome !=null){ 
            lista = (List<Filme>)repository.findByNome(nome);
        }else{
            lista= (List<Filme>)repository.findAll();
        }
        req.addAttribute("filmes", lista);
        return "filmes";
    }

    @GetMapping("/filme/form")
    public String formulario(Model req){
        Filme model = new Filme();
        req.addAttribute("filme", model);
        return "filmes-form";
    }

    @PostMapping("/filme/salvar")
    public String salvar(Filme model){ /* não precisa criar um model do tipo Filme, ele faz automaticamnte, mas precisa usar extamente os mesmos nomes dos atributos da classe Filme */
        repository.save(model);
        return "redirect:/filme";
    }

    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/filme";
    }

    @GetMapping("/filme/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Filme model = repository.findById(id).get();
        req.addAttribute("filme", model);
        return "filmes-form";
    }
}