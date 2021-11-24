package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Produto;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        Produto prod1 = new Produto();

        String nome = req.getParameter("nome");
        String valor = req.getParameter("valor");
        String id_cat = req.getParameter("id_categoria");

        prod1.setNome(nome);

        if(valor !=null && id_cat!=null){
            prod1.setValor(Float.parseFloat(valor));
            //prod1.setId_categoria(Integer.parseInt("id_categoria"));

            out.printf("Nome do Produto: %s", prod1.getNome(), "valor: %f", prod1.getValor());
        }else{
            out.printf("Nome do Produto: %s", prod1.getNome());
        }
    }
}
