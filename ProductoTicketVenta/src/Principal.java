import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
		
		public static Producto solicitarProducto() {
			Scanner sc = new Scanner(System.in);
			System.out.println ("\tIngresa descripcion\n");
			String descripcion = sc.nextLine();
			System.out.println("\tIngresa precio:");
			int precio = sc.nextInt();
			return new Producto(precio, descripcion);
		}
		
		public static void agregarProducto(ArrayList<Producto> productos) {
			productos.add(solicitarProducto());
		}
		
		public static int solicitarIndice() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Ingresa el numero de producto: ");
			return sc.nextInt();
		}

		public static void cambiarCantidad(ArrayList<Producto> productos) {
			int indice = solicitarIndice();
			Producto p = productos.get(indice);
			Scanner sc = new Scanner(System.in);
			System.out.println("Nueva cantidad: ");
			int nuevaCantidad = sc.nextInt();
			p.setCantidad(nuevaCantidad);
			productos.set(indice,  p);
		}
		
		public static void quitarProducto(ArrayList<Producto> productos) {
			int indice = solicitarIndice();
			if(indice < productos.size()) {
				productos.remove(indice);
			} else {
				System.out.println("Numero no valido");
			}
		}
		
		public static void mostrarTicket(ArrayList<Producto> productos) {
			System.out.println ("-".repeat(85));
			System.out.printf ("|%-20s|%-20s|%-20s|%-20s|\n", "Descripcion", "Precio", "Cantidad", "Subtotal");
			System.out.println ("-".repeat(85));
			int total = 0;
			for (Producto p: productos) {
				System.out.printf ("|%-20s|%-20f|%-20f|%-20f|\n", p.getDescripcion(), p.getPrecio(), p.getCantidad(), p.getSubtotal());	
				total += p.getSubtotal();
			}
			System.out.println ("-".repeat(85));
			System.out.printf ("|%83s|\n", "Total: " + String.valueOf(total));
			System.out.println ("           **Gracias por su compra**");		
		}
		
		public static void main(String[] args) {
			ArrayList<Producto> productos = new ArrayList<Producto>();
			Scanner sc = new Scanner(System.in);
			while (true) {
				if (productos.size() > 0) {
					System.out.println ("-".repeat(106));
					System.out.printf ("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Numero", "Descripcion", "Precio", "Cantidad", "Subtotal");
					System.out.println ("-".repeat(106));
				}
		
				int contador = 0;
				for(Producto p: productos) {
					System.out.printf ("|%-20d|%-20s|%-20f|%-20f|%-20f|\n", contador, p.getDescripcion(), p.getPrecio(), p.getCantidad(), p.getSubtotal());
					contador++;
				}
				if (productos.size() > 0) {
					System.out.printf ("-".repeat(106));
				}
				
				System.out.println ("\n1. Agregar producto\n" +
						"2. Cambiar cantidad\n" +
						"3. Quitar producto\n" +
						"4. Mostrar ticket y terminar venta\n" +
						"5. Salir\n" +
						"Selccione: ");
					String eleccion = sc.nextLine();
					if (eleccion.equals("1")) {
						agregarProducto(productos);	
					} else if (eleccion.equals("2")) {
						cambiarCantidad(productos);
					} else if (eleccion.equals("3")) {
						quitarProducto(productos);
					} else if (eleccion.equals("4")) {
						mostrarTicket(productos);	
						break;
					} else if (eleccion.equals("2")) {
						break;
					} else {
						System.out.println ("Opcion no valida");
					}
				}
		}
}



