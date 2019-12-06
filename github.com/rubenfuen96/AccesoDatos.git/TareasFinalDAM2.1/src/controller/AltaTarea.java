package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import moledo.Tarea;

/**
 * Servlet implementation class AltaTarea
 */
@WebServlet("/AltaTarea")
public class AltaTarea extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaTarea() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String titulo = request.getParameter("titulo");
		String descripcion = request.getParameter("descripcion");
		int categoria = Integer.parseInt(request.getParameter("categoria"));
		int importancia = Integer.parseInt(request.getParameter("importancia"));
		int dependencia = Integer.parseInt(request.getParameter("dependencia"));
		int estado = Integer.parseInt(request.getParameter("estado"));
		/*

		Date f_inicio = new Date();
		Date f_final = new Date();
		try {
			 f_inicio = new SimpleDateFormat().parse(request.getParameter("f_inicio"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 f_final = new SimpleDateFormat().parse(request.getParameter("f_final"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Crear objeto
		
		Tarea t = new Tarea();
		t.setTitulo(titulo);
	
		t.setDescripcion(descripcion);
		t.setCategoria(categoria);
		t.setImportancia(importancia);
		t.setDependencia(dependencia);
		//t.setF_inicio(f_inicio);		
		//t.setF_final(f_final);
		t.setEstado(estado);
		
		t.insertar();
		
		response.getWriter().print("<p>"+t.toString()+"</p>");
		//System.out.println(t.toString());				
		
		response.sendRedirect("listaTareas.jsp");


		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
