package com.capgemini.manu.vendas2;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/categoria")
public class Categoria extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		String nome = req.getParameter("nome");
		
		System.out.println("Recebendo requisição");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.printf("<h1>Cadastro de Categorias: %s</h1>", model.getNome());
		out.println("</body>");
		out.println("</html>");


	}
}
