package moledo;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.DAOTarea;

public class Tarea {

	private int id;
	private String titulo;
	private String descripcion;
	private int categoria;
	private int importancia;
	private Date f_inicio;
	private Date f_final;
	private int dependencia;
	private int estado;
	
	public Tarea() {
		
	}
	public Tarea(int id, String titulo, String descripcion, int categoria, int importancia, Date f_inicio, Date f_final,
			int dependencia, int estado) {
		
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.importancia = importancia;
		this.f_inicio = f_inicio;
		this.f_final = f_final;
		this.dependencia = dependencia;
		this.estado = estado;
	}
	public Tarea( String titulo, String descripcion, int categoria, int importancia, Date f_inicio, Date f_final,
			int dependencia, int estado) {
		
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.importancia = importancia;
		this.f_inicio = f_inicio;
		this.f_final = f_final;
		this.dependencia = dependencia;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getImportancia() {
		return importancia;
	}
	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}
	public Date getF_inicio() {
		return f_inicio;
	}
	public void setF_inicio(Date f_inicio) {
		this.f_inicio =  f_inicio;
		
		
	}
	public Date getF_final() {
		return f_final;
	}
	
	public String dameF_finalSQL(){
		SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM/dd");
		String fechaComoCadena = fecha.format(this.f_final);
		
		return fechaComoCadena;
	}
	public String dameF_inicioSQL(){
		SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM/dd");
		String fechaComoCadena = fecha.format(this.f_inicio);
		
		return fechaComoCadena;
	}
	public void setF_final(Date f_final) {
		this.f_final =  f_final;
	}
	public int getDependencia() {
		return dependencia;
	}
	public void setDependencia(int dependencia) {
		this.dependencia = dependencia;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public void insertar() {
		
	
		try {
			DAOTarea.getInstance().insert(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update() {
		
		
		try {
			DAOTarea.getInstance().update(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", categoria=" + categoria
				+ ", importancia=" + importancia + ", f_inicio=" + f_inicio + ", f_final=" + f_final + ", dependencia="
				+ dependencia +  ", estado="
						+ estado +"]";
	}

	        
	
	
}
