package Entities;

public class Categoria {
	private int idCategoria;
	private String Descripcion;
	private int Activa;
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getActiva() {
		return Activa;
	}
	public void setActiva(int activa) {
		Activa = activa;
	}
	
}
