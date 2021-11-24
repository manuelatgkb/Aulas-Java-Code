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

@WebServlet(urlPatterns = "/categoria/alterar")
public class CategoriaAlterarServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");

        Categoria model = new Categoria();
        model.setId(id);
        model.setNome(nome);

        CategoriaDao dao = new CategoriaDao();
        dao.update(model);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria-alterado-sucesso.jsp");
        req.setAttribute("id", model.getId());
        rd.forward(req, resp);
    }
}
