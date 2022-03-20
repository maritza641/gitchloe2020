package actividad3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soporte {
	private static ArrayList<Cliente> cliente = new ArrayList<Cliente>();

	private static ArrayList<Ticket> ticket = new ArrayList<Ticket>();

	//ESTA ES UNA CONSTANTE
	public final static int OPCION_MENU_SALIR=6;
	public final static int OPCION_MENU_VER_TICKET=5;
	public final static int OPCION_MENU_ELIMINAR=4;
	public final static int OPCION_MENU_INGRESAR_TICKET=3;
	public final static int OPCION_MENU_VER_CLIENTE=2;
	public final static int OPCION_MENU_INGRESO_CLIENTE=1;

	public static void main (String[] args) 
	{
		int opcionSeleccionada;
		do 
		{
			opcionSeleccionada=menu();
			switch(opcionSeleccionada) 
			{
			case OPCION_MENU_INGRESO_CLIENTE:
				SolicitudConsulta();
				break;
			case OPCION_MENU_VER_CLIENTE:
				verProducto();
				break;
			case OPCION_MENU_INGRESAR_TICKET:
				IngresarTicket();
				break;
			case OPCION_MENU_VER_TICKET:
				VerTicket();
				break;
			case OPCION_MENU_ELIMINAR:
				eliminarCliente();
				break;
			}
		}while(opcionSeleccionada !=OPCION_MENU_SALIR );
		
		
		
		System.out.printf("Selecciono la opcion %d",opcionSeleccionada);
	}
	private static void SolicitudConsulta() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese rut cliente");
		String rutCliente = scanner.nextLine();
		
		System.out.println("Por favor ingrese un nombre cliente");
		String nombreCliente = scanner.nextLine();
		
		System.out.println("Por favor ingrese telefono cliente");
		String telefonoCliente = scanner.nextLine();
		
		System.out.println("Por favor ingrese email cliente");
		String emailCliente = scanner.nextLine();
		
		
		Cliente NuevaConsulta = new Cliente(rutCliente, nombreCliente, telefonoCliente, emailCliente);
		cliente.add(NuevaConsulta);  
		
	}
	private static void verProducto() {
		// TODO Auto-generated method stub
		for(Cliente producto : cliente) 
		{
			System.out.printf("RUT: %s NOMBRE: %s TELEFONO: %s EMAIL: %s"
					,producto.getRut()
					,producto.getNombre() 
					,producto.getTelefono()
					,producto.getEmail());
		}
	}
	private static void eliminarCliente() {
		// TODO Auto-generated method stub
		if (!cliente.isEmpty())
			cliente.remove(cliente.size()-1);
			else 
			{
			  System.out.println("Se han eliminado los clientes2.");
			}
	}
	private static void IngresarTicket() {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Por favor ingrese numero ticket");
				int numTicket = scanner.nextInt();
				
				System.out.println("enter para ingresar fecha y hora");
				String date = scanner.nextLine();
				
				System.out.println("Por favor ingrese cliente");
				String cliente = scanner.nextLine();
				
				System.out.println("Por favor ingrese producto");
				String producto = scanner.nextLine();

				System.out.println("Por favor ingrese ejecutivo");
				String ejecutivo = scanner.nextLine();

				System.out.println("Por favor ingrese email cliente");
				String rjrcutivoDerivado = scanner.nextLine();

				System.out.println("Por favor ingrese problema");
				String problema = scanner.nextLine();

				System.out.println("Por favor ingrese estado");
				String estado = scanner.nextLine();

				System.out.println("Por favor ingrese solucion");
				String solucion = scanner.nextLine();
				
				
				Ticket IngresoTicker = new Ticket(numTicket, date, cliente, producto,ejecutivo,rjrcutivoDerivado,problema,estado,solucion);
				ticket.add(IngresoTicker);  
		for(Ticket tick : ticket) 
		{
			System.out.printf("NUMERO: %s FECHA: %s CLIENTE: %s PRODUCTO: %s EJECUTIVO: %s EJECUTIVO DERIVADO: %s PROBLEMA: %s SOLUCION: %s ESTADO: %s"
					,tick.getNumero()
					,tick.getFechahora() 
					,tick.getCliente()
					,tick.getProducto()
					,tick.getEjecutivo()
					,tick.getRjrcutivoDerivado()
					,tick.getProblema()
					,tick.getSolucion()
					,tick.getEstado());
			
		}
		
	}
	private static void VerTicket() {
		// TODO Auto-generated method stub
		for(Ticket ticket : ticket) 
		{
			System.out.printf("NUMERO: %s FECHA: %s CLIENTE: %s PRODUCTO: %s EJECUTIVO: %s RJRCITUVO: %s PROBLEMA: %s SOLUCION: %s ESTADO: %s"
					,ticket.getNumero()
					,ticket.getFechahora() 
					,ticket.getCliente()
					,ticket.getProducto()
					,ticket.getEjecutivo()
					,ticket.getRjrcutivoDerivado()
					,ticket.getProblema()
					,ticket.getSolucion()
					,ticket.getEstado());
		}
	}
	private static int menu() 
	{
		System.out.println("MENU DATOS SERVICIO\n================\n");
		System.out.println("1. INGRESAR USUARIO");
		System.out.println("2. VER USUARIO");
		System.out.println("3. INGRESAR TICKET");
		System.out.println("5. VER TICKET");
		System.out.println("4. ELIMINAR USUARIO");
		System.out.println("5. SALIR");

		System.out.println("\nPOR FAVOR INGRESE DATOS");
		
		Scanner scanner = new Scanner(System.in);
		int opcionseleccionada = scanner.nextInt();

		return opcionseleccionada;
	}

}
