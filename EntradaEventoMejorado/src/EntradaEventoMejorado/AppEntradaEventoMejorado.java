package EntradaEventoMejorado;

import java.util.Scanner;

import java.util.ArrayList;

public class AppEntradaEventoMejorado {	
	private static ArrayList<Asiento> asientos = new ArrayList <Asiento>();
	private static ArrayList<Espectador> espectadores = new ArrayList <Espectador>();
	
	private final static int VENTA_DE_ENTRADA 		= 1;
	private final static int VENTAS_DIARIAS 		= 2;
	private final static int ENTRADAS_DISPONIBLES	= 3;
	private final static int SALIR					= 4;
	
	public static int opcionSeleccionada;
	
	
	static Scanner v1 = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		rellenaAsientos();
	    mostrarMenu();
	    
	}

	private static void rellenaAsientos() {
		for(int i=1; i<=30; i++) {
			Asiento asiento = new Asiento(i, true, "palco");
			asientos.add(asiento);
			}
			for(int i=31; i<=60; i++) {
				Asiento asiento = new Asiento(i, true, "platea");
				asientos.add(asiento);
				}	
				for(int i=61; i<=100; i++) {
					Asiento asiento = new Asiento(i, true, "galeria");
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
		int entradaDisponiblePalco = 30;
		int entradaDisponiblePlatea = 30;
		int entradaDisponibleGaleria = 40;
		
		for (Asiento a: asientos) {
		    if (!a.isDisponible()) {
		    	if(a.getTipo().equalsIgnoreCase("Palco")) {
		    		entradaDisponiblePalco--;
		    	} else if(a.getTipo().equalsIgnoreCase("Platea")) {
		    		  entradaDisponiblePlatea--;
		    	   	} else {
				          entradaDisponibleGaleria--;				   
			    }			
		    }
		}  
		System.out.println ("\n");
		System.out.println ("-".repeat(56));
		System.out.println ("|\t ENTRADAS DISPONIBLES 'PALCO': \t\t " +entradaDisponiblePalco+ "\t|");
		System.out.println ("|\t ENTRADAS DISPONIBLES 'PLATEA': \t " +entradaDisponiblePlatea+ "\t|");
		System.out.println ("|\t ENTRADAS DISPONIBLES 'GALERIA': \t " +entradaDisponibleGaleria+ "\t|");
		System.out.println ("-".repeat(56));
		    
	}

	private static void ventaDiaria() {
		
		int totalDia = 0;
		int entradasVendidas = 0;
		
		for (Espectador e: espectadores) {
			totalDia += e.getCantidad();
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
		System.out.println("|\t TOTAL DE VENTAS: \t" +totalDia+ "  |");
		System.out.println ("-".repeat(41));
		System.out.println("\n");
	}

	private static void ventaEntrada() {
		v1.nextLine();
		System.out.println ("\n\tNombre cliente: \t\t");
		String nombre = v1.nextLine();
		System.out.println ("\tRut cliente: \t\t");
		String rut = v1.nextLine();
		System.out.println ("\tIngrese el tipo de asiento: \t\t");
		System.out.println ("\n");
		System.out.println ("-".repeat(41));
		System.out.println ("|\t 1.  'PALCO' --> $100000 \t|");
		System.out.println ("|\t 2.  'PLATEA' --> $60000 \t|");
		System.out.println ("|\t 3.  'GALERIA' --> $30000 \t|");
		System.out.println ("-".repeat(41));
		System.out.println ("\t DIGITE LA OPCION DESEADA: ");
		
		opcionSeleccionada= v1.nextInt();
		
		String tipoAsiento = "";
		
		switch (opcionSeleccionada) {
		case 1:
			tipoAsiento = "Palco";
			break;
		case 2:
			tipoAsiento = "Platea";
			break;
		case 3:
			tipoAsiento = "Galeria";
			break;
		}
		
		System.out.println ("\tCantidad de entradas a comprar: \t\t");
		System.out.println ("\n");
		
		int cantidad = v1.nextInt();
		// repite esto la cantidad igual de asientos comprados
		for(int i=1; i<=cantidad; i++) {
			for(Asiento asiento: asientos) {
				if(asiento.getTipo().equalsIgnoreCase(tipoAsiento) && asiento.isDisponible() == true) {
					asiento.setDisponible(false);
					break;
				}
			}
		}
		if(tipoAsiento.equalsIgnoreCase("Palco")) {
			cantidad = cantidad * 100000;
			}else if (tipoAsiento.equalsIgnoreCase("Platea")) {
					   cantidad = cantidad * 60000;
				}else { 
					cantidad = cantidad * 30000;	
				}
		
		Espectador espectador = new Espectador (cantidad, nombre, rut);
		espectadores.add(espectador);
		
	}
}

/* Integrantes:

Gary Aburto
Maritza Carcamo
Maria Maldonado
Luciano Neria
Miguel Olivera

*/



