
package EntradaEvento;

public class Espectador {	
	private int cantidad;
	private String nombre;
	private String rut;
	
	public Espectador(int cantidad, String nombre, String rut) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.rut = rut;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}	
}	
	
	
	
	
	
	
	
