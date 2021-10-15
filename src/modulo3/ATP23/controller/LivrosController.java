package modulo3.ATP23.controller;
import java.util.ArrayList;

import modulo3.ATP23.model.Livros;

    //controller

    public class LivrosController {
        private ArrayList<Livros> livros = new ArrayList<Livros>();
    
    //create

        public void salvar(Livros livro){
            this.livros.add(livro);
        }
     //read

        public ArrayList<Livros> listar(){
            return this.livros;
        }

        
    //Update
        public void alterar(Livros livro){
            for (int i = 0; i < livros.size(); i++) {
        }
    }

    //delete
        public void deletar(Livros livro){
        this.livros.remove(livro);
    }
}
    
