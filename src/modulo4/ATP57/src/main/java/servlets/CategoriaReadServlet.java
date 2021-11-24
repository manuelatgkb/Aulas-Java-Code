package servlets;

import java.io.IOException;
import java.util.ArrayList;

import dao.CategoriaDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Categoria;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        CategoriaDao dao = new CategoriaDao();
        ArrayList<Categoria> categorias= dao.read();
        String nome = req.getParameter("nome");
        if(nome!=null)
        {
            categorias = dao.read("nome");
        }else{
            categorias = dao.read();
        }
        
        req.setAttribute("categoria", categorias);
        RequestDispatcher rd = req.getRequestDispatcher("categoria-lista.jsp");
        rd.forward(req, resp);
    }
}