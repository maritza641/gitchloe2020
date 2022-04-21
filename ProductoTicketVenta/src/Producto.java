
public class Producto {
	private int precio, cantidad;
	private String descripcion;
	
	public Producto(int precio, String descripcion) {
		this.cantidad = 1;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public double getSubtotal() {
		return cantidad * precio;
	}
	
	public double getPrecio() {
		return precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}	
}

