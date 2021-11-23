package servlets;
import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Categoria;

@WebServlet(urlPatterns = "/categoria")

public class CategoriaServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        Categoria model = new Categoria();
        
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));

        //model.setId(dao.create(model));

        PrintWriter out = resp.getWriter();
        out.printf("Categoria Salva com sucesso! Id gerado: = %d", model.getId());


    }
}
