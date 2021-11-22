import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")

public class Produto {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        out.println("Modulo Produtos - Cadastro Produto");
    }
}
