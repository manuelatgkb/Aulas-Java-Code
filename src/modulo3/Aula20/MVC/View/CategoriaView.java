package modulo3.Aula20.MVC.View;

import modulo3.Aula20.MVC.Controller.CategoriaController;
import modulo3.Aula20.MVC.Model.Categoria;

public class CategoriaView {
    public static void main(String[] args) {
        CategoriaController controller = new CategoriaController();

        Categoria categoria1 = new Categoria();
        categoria1.nome = "Tvs";
        categoria1.descricao = "Tv até 32´´";

        controller.salvar(categoria1);

        for (Categoria cat : controller.listar()) {
            System.out.println(cat.nome);
            System.out.println(cat.descricao);
        }
    }
}
