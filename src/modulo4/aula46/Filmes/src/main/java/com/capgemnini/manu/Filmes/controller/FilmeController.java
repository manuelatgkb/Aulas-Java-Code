package com.capgemnini.manu.Filmes.controller;

import javax.servlet.http.HttpServletRequest;

import com.capgemnini.manu.Filmes.model.Filme;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import repository.FilmeRepository;

@Controller
public class FilmeController(){
    
    @GetMapping("/filme")
    public String filmes(Model req){
        List<Filme> lista = (List<Filme>)repository.findAll();
        req.addAttribute("filmes", lista);
        return "filmes";

    }

    @GetMapping("/filme/form")
    public String formulario(Model req){
        Filme model = new Filme();
        req.addAttribute("filme", model);
        return "filmes-form";
    }

	@PostMapping public String salvar(Filme model){
        Repository.save(model);
        return "redirect:/filme";
    }

    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id){
        Repository.deleteById(id);
        return "redirect:/filme";
    }

    @GetMapping("/filme/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Filme model = Repository.findById(id).get();
        req.addAttribute("filme", model);
        return "filmes-form";
    }
}