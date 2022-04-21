// Actividad, Parte #6, aplicacion para una tienda de venta de alimento para perros

package CosasDePerros;

import Leer.*;

public class AppVentaProductos {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("\tTIENDA COSAS DE PERROS \n");
		
		boolean continuar = true;
		int lecturaProducto, lecturaCantidad; //variables para seleccionar el producto y la cantidad
		
		/**
		 * cargar productos
		 */
		Producto alimento1 = new Alimentos("Royal Canin 3kg Junior", 13900, 6, true, "Junior");
		Producto alimento2 = new Alimentos("Royal Canin 3kg Adulto", 12900, 6, true, "Adulto");
		Producto alimento3 = new Alimentos("Royal Canin 5kg Senior", 19990, 6, true, "Senior");
		Producto alimento4 = new Alimentos("Bill Jack 3kg Junior", 11900, 6, true, "Junior");
		Producto alimento5 = new Alimentos("Bill Jack 3kg Adulto", 12900, 6, true, "Adulto");
		Producto alimento6 = new Alimentos("Bill Jack 5kg Senior", 24900, 6, true, "Senior");
		
		/**
		 * array catalogo para contener los productos 
		 */
		
		Producto catalogo[] = new Producto[Producto.dimensionArray];
		
		/**
		 * se crea el objeto gestion para mostrar y vender los alimentos y mostrar caja
		 */
		Gestion gestion = new Gestion();
		
		/**
		 * se rellena el array catalogo
		 */
		catalogo[0] = alimento1;
		catalogo[1] = alimento2;
		catalogo[2] = alimento3;
		catalogo[3] = alimento4;
		catalogo[4] = alimento5;
		catalogo[5] = alimento6;
		
		do {
				try {
				System.out.println("      INGRESE LA OPCION DESEADA: \n\n"
				+ "1. Mostrar productos \n"
				+ "2. Vender productos \n"
				+ "3. Mostrar caja \n"
				+ "SALIR --> PULSE OTRO NUMERO \n");
				
				switch (Leer.datoInt()) {
				case 1:
						gestion.mostrarProductos(catalogo);
						break;
				
				case 2:
						System.out.println("Que producto desea comprar?");
						gestion.mostrarNombreProductos(catalogo);
						lecturaProducto = Leer.datoInt();
						System.out.println("Cuantas unidades desea?");
						lecturaCantidad = Leer.datoInt();
						gestion.comprarProducto(catalogo, lecturaProducto, lecturaCantidad);
						break;
					
				case 3:
						System.out.println("$" + gestion.mostrarCaja());
						break;
						default:
							continuar = false;
						}
					} catch(Exception e)
					{
						System.out.println("Ingreso invalido, intentelo nuevamente");
					}
				} while(continuar);
		}

}
