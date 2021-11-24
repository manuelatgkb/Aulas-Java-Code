package servlets;

import java.io.IOException;

import dao.CategoriaDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Categoria;

@WebServlet(urlPatterns = "/categoria/Deletar")
public class CategoriaDeletarServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();

        int id = Integer.parseInt(req.getParameter("id"));
        model.setId(id);
        dao.delete(model);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria/listar");
        rd.forward(req, resp);
    }
}
