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
        String nome = req.getParameter("nome");
        float valor = Float.parseFloat(req.getParameter("valor"));
        int id_categoria = Integer.parseInt("id_categoria");

        PrintWriter out = resp.getWriter();
        out.printf("Nome do Produto: %s", nome, "valor: %s", valor, "id_categoria", id_categoria);
      
    }
}
