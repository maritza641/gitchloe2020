
package EntradaEvento;

public class Evento {
	private Espectador espectador;
	private Asiento asientos;
	private int precio;
	
	public Evento(Espectador espectador, Asiento asientos, int precio) {
		this.setEspectador(espectador);
		this.asientos = asientos;
		this.precio = precio;
	}

	public Asiento getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento asientos) {
		this.asientos = asientos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}				
}	
