package modulo3.Aula20.MVC.View;

import java.util.ArrayList;

import modulo3.Aula20.MVC.Controller.ProdutoController;
import modulo3.Aula20.MVC.Model.Produto;

public class ProdutoView {
    public void executa(String[] args) {
        Produto p = new Produto("TV", 1999.99, "Samsung");

        ProdutoController controller = new ProdutoController();
        controller.salvar(p);

        ArrayList<Produto> prods = controller.listar();

        for (Produto prodSalvo : prods) {
            System.out.println(prodSalvo);
        }

    }
}
