package modulo3.ATP23.view;

import modulo3.ATP23.controller.LivrosController;
import modulo3.ATP23.model.Livros;

public class View2 {
   public static void main(String[] args) {
       Livros livro1 = new Livros(1);
       Livros livro2 = new Livros(2);
       System.out.println(livro1.equals(livro2));


   } 
}
