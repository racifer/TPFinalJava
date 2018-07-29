package Entities;

public class Direccion {
	private int idDireccion;
	private String Calle;
	private String Numero;
	private String Piso;
	private String Depto;
	private String Localidad;
	private String Provincia;
	private String Pais;
	private Personas persona;
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public String getPiso() {
		return Piso;
	}
	public void setPiso(String piso) {
		Piso = piso;
	}
	public String getDepto() {
		return Depto;
	}
	public void setDepto(String depto) {
		Depto = depto;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public Personas getPersona() {
		return persona;
	}
	public void setPersona(Personas persona) {
		this.persona = persona;
	}
}
