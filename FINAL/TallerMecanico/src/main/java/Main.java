import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Maritza Carcamo M.
 *
 */

public class Main {
static Scanner scanner = new Scanner(System.in);
	
	/**
	 *  ArrayList de los objetos que utilizaremos
	 */
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	private static ArrayList<Mantenciones> mantenciones = new ArrayList<>();
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	
	public final static int OPCION_MENU_AGREGAR_CLIENTE=1;
	public final static int OPCION_ELIMINAR_CLIENTE=2;
	public final static int OPCION_MENU_MANTENCIONES=3;
	public final static int OPCION_MENU_RECAUDACIONES=4;
	public final static int OPCION_AGREGAR_MANTENCION=5;
	public final static int OPCION_SALIR=7;

 
	
public static void main(String [] args)
{
	menu();
}
	 private static void menu() 
	 {
	int opcionSeleccionada;
	
	do 
	{
		
		System.out.println("Bienvenido a Gas Monkey");
		System.out.println("________________________");
		System.out.println("1. Agregar cliente");
		System.out.println("2. Eliminar cliente");
		System.out.println("3. Lista de mantenciones");
		System.out.println("4. Recaudaciones");
		System.out.println("5. Agregar mantenciones");
		System.out.println("7. salir\n");
		
	
		opcionSeleccionada = scanner.nextInt();
		
	
	
		switch(opcionSeleccionada) 
		{
		case OPCION_MENU_AGREGAR_CLIENTE:
			agregarCliente();
			break;
		case OPCION_ELIMINAR_CLIENTE:
			eliminarCLiente();
			break;
		case OPCION_MENU_MANTENCIONES:
			listarMantenciones();
			break;
		case OPCION_MENU_RECAUDACIONES:
			recaudaciones();
			break;
		case OPCION_AGREGAR_MANTENCION:
			agregarMantencion();
			break;
		case OPCION_SALIR:
			//calcularAreaCirculo();
			break;
		}
		
	}while(opcionSeleccionada !=OPCION_SALIR );
	
	System.out.printf("Selecciono la opcion %d",opcionSeleccionada);
	

}
	 /**
	  * Permite el ingreso de datos
	  */
	 private static void agregarCliente() 
	 {	
		 scanner.nextLine();
		
		 System.out.println("Ingrese rut del cliente");
		 String rutCliente = scanner.nextLine();
		 
		 System.out.println("Ingrese Nombre del cliente");
		 String nombreCliente = scanner.nextLine();
		 
		 System.out.println("Ingrese Apellidos del cliente");
		 String apellidosCliente = scanner.nextLine();
		 
		 System.out.println("Ingrese Correo del cliente");
		 String correoCliente = scanner.nextLine();
		 
		 System.out.println("Ingrese Celular del cliente");
		 String telefonoCliente = scanner.nextLine();
		
		 
		 Cliente cliente = new Cliente(rutCliente, nombreCliente, apellidosCliente, correoCliente, telefonoCliente);
		 
		 boolean agregarVehiculos = true;
	 
		 
		 do 
		 {
			 System.out.println("Ingrese patente del vehiculo");
			 String patente = scanner.nextLine();
			 
			 System.out.println("Ingrese marca del vehiculo");
			 String marca = scanner.nextLine();
			 
			 System.out.println("Ingrese modelo del vehiculo");
			 String modelo = scanner.nextLine();
			 

				System.out.println("Ingrese año de fabricacion del auto");
				int yearAuto = scanner.nextInt();
							
				Vehiculo vehiculo = new Vehiculo(patente,marca,modelo,LocalDate.of(yearAuto, 01, 01),cliente);
				vehiculos.add(vehiculo); // AÑADE AL ARRAY PARA USO FUTURO
			
				
				scanner.nextLine();
			 
			 System.out.println("Desea añadir otro vehiculo?");
			 String opcion = scanner.nextLine();
			 
			 if(opcion.equalsIgnoreCase("NO")) {
					agregarVehiculos = false;
					break;
				}	
			 
			 
		 }while(agregarVehiculos);
	
	 }
	 
	 /**
	  * Permite la eliminacion de de datos
	  */
	 public static void eliminarCLiente()
	 {
		 scanner. nextLine();
		 System.out.println("Digite el rut del cliente a ELIMINAR");
		 String rut = scanner.nextLine();
		 System.out.println(rut);
		 
		 Cliente cliente = buscarCliente(rut);
		 if(cliente !=null) 
		 {
			 clientes.remove(cliente);
			 System.out.println("Se ha eliminado el cliente");
		 }
	 }
		private static Cliente buscarCliente(String rut) 
		{
			for (Cliente c: clientes) 
			{
				if (c.getRut().equalsIgnoreCase(rut)) 
				{
					return c;
				}
			}
			return null;
		}
		
		/**
		  * Permite el ingreso de mantenciones por parte del usuario
		  */
		public static void agregarMantencion() 
		{
			System.out.println("VEHICULOS REGISTRADOS");
			for(Vehiculo vehiculo : vehiculos) 
			{
				System.out.println("________________");
				System.out.println("Patente vehiculo: "+vehiculo.getPatente());
				System.out.println("Marca vehiculo: "+vehiculo.getMarca());
				System.out.println("Modelo vehiculo: "+vehiculo.getModelo());
				System.out.println("Fabricacion vehiculo: "+vehiculo.getFecha());
				System.out.println("Dueño vehiculo: "+vehiculo.getDueño().getNombre()+" "+vehiculo.getDueño().getApellido());
				System.out.println("________________");
			}
			scanner.nextLine();
			
			System.out.println("ESCRIBA LA PATENTE DEL VEHICULO QUE SE LE REALIZO MANTENCION");
			String mantencion = scanner.nextLine();
			
			Vehiculo vehiculoMantencion = null;
			
			for(Vehiculo vehiculo : vehiculos) 
			{
				if(mantencion.equalsIgnoreCase(vehiculo.getPatente())) 
				{
					vehiculoMantencion = vehiculo;
				}
			}
			
			System.out.println("Ingrese el tipo de mantencion");
			String tipoMantencion = scanner.nextLine();
			
			System.out.println("Ingrese observaciones realizadas al vehiculo");
			String observacionesVehiculo = scanner.nextLine();
			
			System.out.println("Escriba monto cobrado");
			int montoMantencion = scanner.nextInt(); 
			
			Mantenciones manten = new Mantenciones(false, tipoMantencion, observacionesVehiculo, montoMantencion, vehiculoMantencion);
			mantenciones.add(manten);
		}
		
		/**
		  * Permite listar las mantenciones realizadas
		  */
		private static void listarMantenciones() {
			
			System.out.println("Listado de mantenciones realizadas: \n===================================================");
			
			// Por cada mantencion realizada, muestra los datos en la consola
			for(Mantenciones mantencion : mantenciones) {
				System.out.println("PATENTE AUTO MANTENIDO: "+mantencion.getVehiculo().getPatente());
				System.out.println("DUEÑO DE AUTO MANTENIDO: "+mantencion.getVehiculo().getDueño().getNombre()+" "+mantencion.getVehiculo().getDueño().getApellido());
				System.out.println("TIPO MANTENCION: "+mantencion.getMantencionesRealizadas());
				System.out.println("OBSERVACIONES: "+mantencion.getObservaciones());
				System.out.println("MONTO: "+mantencion.getMontoServicio());
				System.out.println("===================================================\n");
			}		
		}
		/**
		  * Permite ver el total de recaudaciones en un dia
		  */
		private static void recaudaciones() 
		{
			int totalDia = 0;
			int mantenRealizadas = 0;
			
			for (Mantenciones e: mantenciones) {
				totalDia += e.getMontoServicio();
			
				for (Mantenciones a: mantenciones) {
					if (a.isMantencione() == false) {
						mantenRealizadas++;
					}
				}
		
			}
			System.out.println ("-".repeat(41));
			System.out.println ("|\t RESUMEN VENTAS DEL DIA \t|");
			System.out.println ("-".repeat(41));
			System.out.println("|\t MANTENCIONES REALIZADAS: \t" +mantenRealizadas+ " \t|");
			System.out.println("|\t TOTAL DE PAGOS MANTENCIONES: \t" +totalDia+ "  |");
			System.out.println ("-".repeat(41));
			System.out.println("\n");
			
		}
		
}


