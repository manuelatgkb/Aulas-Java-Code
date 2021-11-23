package com.capgemini.aula43.servlets;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.atp55.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));

        model.setId(dao.insert(model));


        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria -- Categoria Salva com Sucesso! Id gerado = %d", model.getId());
    }
}
