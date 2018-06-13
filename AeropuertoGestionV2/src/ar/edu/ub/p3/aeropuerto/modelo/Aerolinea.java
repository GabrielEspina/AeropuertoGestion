package ar.edu.ub.p3.aeropuerto.modelo;

public class Aerolinea {
	
	private String nombre;
	private String idAeropuerto;

	
	public Aerolinea(String idAeropuerto,String nombre) {
		setIdAeropuerto(idAeropuerto);
		setNombre(nombre);
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(String idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

}
