package modulo3.Aula4.controller;

import java.util.ArrayList;

import modulo3.Aula4.model.Artista;

public class ArtistaController {
    private ArrayList<Artista> artistas = new ArrayList<Artista>();

    public void salvar(Artista a){
        artistas.add(a);
    }

    public ArrayList listar(){
        return artistas;

    }
}
