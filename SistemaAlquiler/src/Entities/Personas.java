package Entities;

public class Personas {
	private int idPersonas;
	private String Nombre;
	private String Apellido;
	private String DNI;
	private String Telefono;
	private String Celular;
	
	public int getIdPersonas() {
		return idPersonas;
	}
	public void setIdPersonas(int idPersonas) {
		this.idPersonas = idPersonas;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	
}
