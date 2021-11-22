import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        PrintWriter out = resp.getWriter();

        String nome = req.getParameter("nome");
        String valor = req.getParameter("valor");
        String id_cat = req.getParameter("id_categoria");

        if(valor !=null && id_cat!=null){
            float valor_produto = Float.parseFloat(valor);
            int id_categoria = Integer.parseInt("id_categoria");

            out.printf("Nome do Produto: %s", nome, "valor: %f", valor_produto, "id da categoria: %d: ", id_categoria);
        }else{
            out.printf("Nome do Produto: %s", nome);
        }
    }
}
