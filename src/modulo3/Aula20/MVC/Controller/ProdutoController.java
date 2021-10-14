package modulo3.Aula20.MVC.Controller;

import java.util.ArrayList;

public class ProdutoController {
    private ArrayList<ProdutoView> produtos = new ArrayList<ProdutoView>();

    public void salvar(){
        this.produtos.add(p);

    }

    public ArrayList<ProdutoView> listar(){
        return produtos;
    }
}
