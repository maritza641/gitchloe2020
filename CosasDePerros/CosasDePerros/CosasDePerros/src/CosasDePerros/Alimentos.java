package CosasDePerros;

public class Alimentos extends Producto {
	
	/**
	 * atributos
	 */
	private String tipo;
	
	/**
	 * constructor
	 */
	public Alimentos() {
		
	}

	public Alimentos(String nombre, int precio, int cantidad, boolean disponible, String tipo) {
		super(nombre, precio, cantidad, disponible);
		this.tipo = tipo;
	}

	/**
	 * metodos
	 */
	@Override
	public String toString() {
		return "Alimentos " + 
				super.toString() +
				"Tipo: " + this.tipo;
	}
	
	/**
	 * getters & setters
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
