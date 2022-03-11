package ni.edu.uca.models;

public class Nacionalidad {
	
	private int idNacionalidad;
	private String nombre;
	private boolean activo;
	
	
	public Nacionalidad() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Nacionalidad(int idNacionalidad, String nombre, boolean activo) {
		super();
		this.idNacionalidad = idNacionalidad;
		this.nombre = nombre;
		this.activo = activo;
	}


	public int getIdNacionalidad() {
		return idNacionalidad;
	}


	public void setIdNacionalidad(int idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	@Override
	public String toString() {
		return "Nacionalidad [idNacionalidad=" + idNacionalidad + ", nombre=" + nombre + ", activo=" + activo + "]";
	}
	
	
	
	
	

}
