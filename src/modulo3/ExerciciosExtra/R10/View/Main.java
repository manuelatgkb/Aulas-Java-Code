package modulo3.ExerciciosExtra.R10.View;

import modulo3.ExerciciosExtra.R10.Domain.Categoria;
import modulo3.ExerciciosExtra.R10.Repository.CategoriaRepository;

public class Main {
    public static void main(String[] args) {
        CategoriaRepository repo = new CategoriaRepository();
        Categoria cat1 = new Categoria(1);
        cat1.setNome("Smartphone");
        cat1.setDescricao("Telefone inteligente");

        Categoria cat2 = new Categoria(2);
        cat2.setNome("Smart Tv");
        cat2.setDescricao("TV Esperta");

        repo.create(cat1);
        repo.create(cat2);
        listar(repo);

        cat1.setDescricao("Telefones espertões");
        repo.update(cat1);
        listar(repo);
    }
    private static void listar(CategoriaRepository repo){
        for (Categoria c : repo.read()) {
            System.out.println(c);
            
        }
    }
}
