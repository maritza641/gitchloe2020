package CosasDePerros;
/**
 * 
 * @author 
 *
 */
public abstract class Producto {
	/**
	 * atributos
	 */
	private String nombre;
	private int precio;
	private int cantidad;
	private boolean disponible = false;
	
	public static int dimensionArray;
	
	/**
	 * constructores
	 */
	public Producto() {
		
	}

	public Producto(String nombre, int precio, int cantidad, boolean disponible) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.disponible = disponible;
		
		dimensionArray++; //se obtiene con esta variable la dimension del array
	}

	/**
	 * metodos
	 * 
	 */
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " " + 
			   "Precio: $ " + this.getPrecio() + " " +
	           "En Stock: " + this.getCantidad() + "un ";
			   
	} 

	/**
	 * getters & setters
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}
/**
 * 
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return
 */
	public int getPrecio() {
		return this.precio;
	}
/**
 * 
 * @param precio
 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
/**
 * 
 * @return
 */
	public int getCantidad() {
		return this.cantidad;
	}
/**
 * 
 * @param cantidad
 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isDisponible() {
		if(getCantidad() >0) this.disponible = true;
		return this.disponible;
	}
	/**
	 * 
	 * @param disponible
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
