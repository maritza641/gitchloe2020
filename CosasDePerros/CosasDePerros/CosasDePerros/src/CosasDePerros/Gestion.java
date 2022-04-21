package CosasDePerros;

public class Gestion {

	/**
	 * atributos
	 */
	private Producto productos[] = null;
	private int caja;
	
	/**
	 * constructores
	 */
	public Gestion() {
		
	}
	
	public Gestion(Producto[] productos) {
		
		this.productos = productos;
	}
	
	public Producto[] cargarProductos() {
		return productos;
	}
	
	public void mostrarProductos(Producto[] productos) {
		for (int i=0; i<productos.length; i++) {
			System.out.println(productos[i] + " \n");
		}
	}

	public void mostrarNombreProductos(Producto[] productos) {
		for(int i=0; i<productos.length; i++) {
			System.out.println(i+1+ " " + productos[i].getNombre() + " ");
		}
		System.out.println("_".repeat(20));
	}
	
	public int comprarProducto(Producto[] productos, int num, int cantidadUnidades) {
		if(productos[num-1].isDisponible()) {
			if(productos[num-1].getCantidad() >= cantidadUnidades) {
				System.out.println("La compra se realizo con exito!!\n");
				productos[num-1].setCantidad(productos[num-1].getCantidad() - cantidadUnidades);
					return caja += cantidadUnidades * productos[num-1].getPrecio();
			} else {
					System.out.println("no hay cantidad suficiente de producto");
				   }
					} else {
					   	   System.out.println("no hay cantidad suficiente de producto");
				   	   	   }
				   		   return caja;
					}
					
					public int mostrarCaja() {
						System.out.println("El total de la caja es ");
						caja = Math.round(caja*100);
						return caja/100;
					}
		}
	

