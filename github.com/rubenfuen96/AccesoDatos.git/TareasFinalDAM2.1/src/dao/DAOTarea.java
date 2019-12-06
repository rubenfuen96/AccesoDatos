package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import connection.DBConnection;
import moledo.Tarea;

public class DAOTarea {

	private Connection con = null;

	public static DAOTarea instance = null;

	public DAOTarea() throws SQLException {
		try {
			con = DBConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DAOTarea getInstance() throws SQLException {
		if (instance == null)
			instance = new DAOTarea();
		return instance;
	}
	public void insert(Tarea t) throws SQLException {
		
		try {
			
	String sql = "INSERT INTO tareas (titulo, descripcion, categoria, importancia,dependencia,estado  ) VALUES (?,?,?,?,?,?)";
			
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, t.getTitulo());
		ps.setString(2, t.getDescripcion());
		ps.setInt(3, t.getCategoria());
		ps.setInt(4, t.getImportancia() );
		ps.setInt(5, t.getDependencia());
		ps.setInt(6, t.getEstado());
		/*...........*/
		System.out.println(ps.toString());
		ps.executeUpdate();
		ps.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	
	public void update(Tarea t) throws SQLException{
		
		PreparedStatement ps = con.prepareStatement("UPDATE tarea SET titulo = ?, descripcion = ? ... WHERE id = ");
		ps.setString(1, t.getTitulo());
		
		ps.executeUpdate();
		ps.close();
		
	}
	public ArrayList<Tarea> listaTareas() throws SQLException{
		
		//creo una lista vacia
		ArrayList<Tarea> lista = new ArrayList<>();
		
		
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM tareas");
			 ResultSet resultado = ps.executeQuery();
			 
				while(resultado.next()) {
					
					
					Tarea t = new Tarea(resultado.getInt("id"), resultado.getString("titulo"), 
							resultado.getString("descripcion"), resultado.getInt("categoria"),
							resultado.getInt("importancia"), resultado.getDate("f_inicio"), resultado.getDate("f_final"),
							resultado.getInt("dependencia"),resultado.getInt("estado"));
					
					lista.add(t); 
				}
				
						} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		//retorno la lista con los datos
		return lista;
	}
	
	
	
}
