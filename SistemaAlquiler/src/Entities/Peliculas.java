package Entities;

import java.sql.Time;

public class Peliculas {
	private int idPeliculas;
	private int stock;
	private String Director;
	private String Actores;
	private Time Duracion;
	private String Sinopsis;
	private Categoria categoria;
	private String Titulo;
	public int getIdPeliculas() {
		return idPeliculas;
	}
	public void setIdPeliculas(int idPeliculas) {
		this.idPeliculas = idPeliculas;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getActores() {
		return Actores;
	}
	public void setActores(String actores) {
		Actores = actores;
	}
	public Time getDuracion() {
		return Duracion;
	}
	public void setDuracion(Time duracion) {
		Duracion = duracion;
	}
	public String getSinopsis() {
		return Sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
}
