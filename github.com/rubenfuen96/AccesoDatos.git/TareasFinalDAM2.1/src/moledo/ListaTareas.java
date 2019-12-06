package moledo;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.DAOTarea;

public class ListaTareas {

	private ArrayList<Tarea> lista;
	
	public String pintaTarea() throws ClassNotFoundException, InstantiationException{
		String s = "";
		Tarea p = new Tarea();
		s+= "<thead class='thead-dark'>"+
		"<tr>"+ "<th scope='col'>"+"id"+"</td>"+
		"<th scope='col'>"+"Titulo"+"</td>"+
		"<th scope='col'>"+"Descripcion"+"</td>"+
		"<th scope='col'>"+"Fecha inicio"+"</td>"+
		"<th scope='col'>"+"Fecha fin"+"</td>"+
		"<th scope='col'>"+"Prioridad"+"</td>"+
		"<th scope='col'>"+"Categoria"+"</td>"+
		"<th scope='col'>"+"Editar"+"</td>"+
		"<th scope='col'>"+"Borrar"+"</td>"+
		"<th scope='col'>"+"Dividir"+"</td>"+
		"</th>"+
		"</thead>"+
		"<tbody>";
		
		if(p.listaTareas()!=null) {
			for(Tarea t: p.listaTareas()) {
				s+=t.pintaTarea();
			}
		}
		s+="</tbody>";
		return s;
	}
	
	
	public ArrayList<Tarea> obtenerTareas(){
		

		try {
			lista = DAOTarea.getInstance().listaTareas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lista;
	}
	
	
}
