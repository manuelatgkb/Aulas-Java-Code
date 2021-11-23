package com.capgemini.aula43.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import jakarta.servlet.HttpServlet;
import jakarta.servlet.HttpServletRequest;
import jakarta.servlet.HttpServletResponse;
import src.modulo4.aula43.dao.CategoriaDao;


@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServelet extends HttpServlet{
    @Override
    protected void doGet(HttpServletsRequest req, HttpResponse resp) throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        CategoriaDao dao = new CategoriaDao();
        for(Categoria model:dao.read()){
            out.printf("%d - %s \n", model.getId(), model.getNome());
        }
    }
}
