
package EntradaEvento;

import java.util.Scanner;
import java.util.ArrayList;

public class AppEntradaEvento {
	
	private static ArrayList<Asiento> asientos = new ArrayList <Asiento>();
	private static ArrayList<Evento> evento = new ArrayList <Evento>();
	
	private final static int VENTA_DE_ENTRADA 		= 1;
	private final static int VENTAS_DIARIAS 		= 2;
	private final static int ENTRADAS_DISPONIBLES	= 3;
	private final static int SALIR					= 4;
	
	public static int opcionSeleccionada;
	
	final static int PRECIO = 3500;
	
	
	static Scanner v1 = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		rellenaAsientos();
	    mostrarMenu();
	}

	private static void rellenaAsientos() {
		for(int i=1; i<=30; i++) {
			Asiento asiento = new Asiento(i, true);
			asientos.add(asiento);	
		}
	}

	private static void mostrarMenu() {
		
		do {
			System.out.println ("\n");
			System.out.println ("-".repeat(41));
			System.out.println ("|\t      MENU PRINCIPAL \t\t|");
			System.out.println ("-".repeat(41));
			System.out.println ("|\t 1.  VENTA DE ENTRADA \t\t|");
			System.out.println ("|\t 2.  VENTAS DIARIAS \t\t|");
			System.out.println ("|\t 3.  ENTRADAS DISPONIBLES\t|");
			System.out.println ("|\t 4.  SALIR \t\t\t|");
			System.out.println ("-".repeat(41));
			System.out.println ("\t DIGITE LA OPCION DESEADA: ");
			
			opcionSeleccionada= v1.nextInt();
			
			switch (opcionSeleccionada) {
			case VENTA_DE_ENTRADA:
				ventaEntrada();
				break;
			case VENTAS_DIARIAS:
				ventaDiaria();
				break;
			case ENTRADAS_DISPONIBLES:
				entradaDisponible();
				break;
			}
		} while (opcionSeleccionada != SALIR);	
	}

	private static void entradaDisponible() {
		int entradaDisponible = 0;
		for (Asiento a: asientos) {
		    if (a.isDisponible()) {
				  entradaDisponible++;				   
			    }			
		    }
		System.out.println ("\n");
		System.out.println ("-".repeat(41));
		System.out.println ("|\t ENTRADAS DISPONIBLES: \t " +entradaDisponible+ "\t|");
		System.out.println ("-".repeat(41));
	}

	private static void ventaDiaria() {
		
		int totalDia = 0;
		int entradasVendidas = 0;
		
		for (Evento e: evento) {
			totalDia += e.getPrecio();
		}
		
		for (Asiento a: asientos) {
			if (a.isDisponible() == false) {
				entradasVendidas++;
			}
		}
		
		System.out.println ("-".repeat(41));
		System.out.println ("|\t RESUMEN VENTAS DEL DIA \t|");
		System.out.println ("-".repeat(41));
		System.out.println("|\t ENTRADAS VENDIDAS: \t" +entradasVendidas+ " \t|");
		System.out.println("|\t TOTAL DE VENTAS: \t" +totalDia+ "   |");
		System.out.println ("-".repeat(41));
		System.out.println("\n");
	}

	private static void ventaEntrada() {
		v1.nextLine();
		System.out.println ("\n\tNombre cliente: \t\t");
		String nombre = v1.nextLine();
		System.out.println ("\tRut cliente: \t\t");
		String rut = v1.nextLine();
		System.out.println ("\tCantidad de Entradas: \t\t");
		int cantidad = v1.nextInt();
		
		Espectador espectador = new Espectador (cantidad, nombre, rut);
	
		int total = cantidad * PRECIO;
		Asiento asiento = null;
		
		for (int i=0; i<cantidad; i++) {
		    for (Asiento a: asientos) {
			    if (a.isDisponible()) {
				    asiento = a;
				    a.setDisponible(false);
				    break;
			    }			
		    }
		}
		Evento eventoNuevo = new Evento(espectador, asiento, total);	
		evento.add(eventoNuevo);
	}
}

/* Integrantes:

Gary Aburto
Maritza Carcamo
Maria Maldonado
Luciano Neria
Miguel Olivera

*/
