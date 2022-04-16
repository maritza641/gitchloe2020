package EntradaEvento;

public class Asiento {
	private int numero;
	private Espectador espectador;
	private boolean disponible;
	
	public Asiento() {
	}

	public Asiento(int numero, boolean disponible) {
		this.numero = numero;
		this.espectador = null;
		this.setDisponible(disponible);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
	
	
	

