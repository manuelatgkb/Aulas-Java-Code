package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import dao.CategoriaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Categoria;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest rep, HttpServletResponse resp)throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        CategoriaDao dao = new CategoriaDao();
        for(Categoria model: dao.read()){
           out.printf("Id : %d - Nome : %s - Descrição: %s\n", model.getId(), model.getNome(), model.getDescricao());
        }
    }
}