package Geometria1;

import java.util.Scanner;

public class AppGeometria1 {

	private final static int AREA_DEL_RECTANGULO   = 1;
	private final static int RADIO_DEL_CIRCULO     = 2; 
	private final static int PERIMETRO_DEL_CIRCULO = 3;
	private final static int AREA_DEL_CIRCULO      = 4;
	private final static int SALIR                 = 5;
	
	public static int opcionSeleccionada;
	
	public static void main(String[] args) {
		
		int opcionSeleccionada;
		do {
				opcionSeleccionada = menu();
				switch (opcionSeleccionada) {
					case AREA_DEL_RECTANGULO:
						areaRectangulo();
						break;
					
					case RADIO_DEL_CIRCULO:
						radioCirculo();
						break;
						
					case PERIMETRO_DEL_CIRCULO:
						perimetroCirculo();
						break;
						
					case AREA_DEL_CIRCULO:
						areaCirculo();
						break;
		}
		
		
		} while (opcionSeleccionada != SALIR);
		
		System.out.printf ("Selecciona la opcion %d", opcionSeleccionada);

	}

	public static int menu() {
		System.out.println ("\n\n _______________________________________");
		System.out.println ("|                                       |");
		System.out.println ("|\t      MENU PRINCIPAL    \t|");
		System.out.println (" _______________________________________");
		System.out.println ("|\t 1. AREA DEL RECTANGULO \t|");
		System.out.println ("|\t 2. RADIO DEL CIRCULO \t\t|");
		System.out.println ("|\t 3. PERIMETRO DEL CIRCULO \t|");
		System.out.println ("|\t 4. AREA DEL CIRCULO \t\t|");
		System.out.println ("|\t 5. SALIR \t\t\t|");
		System.out.println (" _______________________________________ \n\n");
		
		System.out.println ("    DIGITE LA OPCION DESEADA: \t\t\t");
		Scanner scanner = new Scanner (System.in);
		int opcionSeleccionada = scanner.nextInt();
	//	System.out.println ("\n");
		return opcionSeleccionada;
		
	}
	
	public static void areaRectangulo() {
		Scanner ar = new Scanner (System.in);
		System.out.println ("\tIngrese la BASE: \t\t\t");
		double base = ar.nextDouble();
		System.out.println ("\tIngrese la ALTURA: \t\t\t");
		double altura = ar.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo (base, altura);
		double area = rectangulo.AreaRectangulo();
		System.out.printf ("\tEL AREA DEL RECTANGULO ES: \n\t\t\t\t\t"  + area);
	}
		
	public static void radioCirculo() {
		Scanner rc = new Scanner (System.in);
		System.out.println ("\tIngrese el DIAMETRO: \t\t\t");
		double diametro = rc.nextDouble();
		double radio = diametro/2;
		
		Circulo circulo = new Circulo (diametro, radio);
		System.out.printf ("\tEL RADIO DEL CIRCULO ES: \n\t\t\t\t" + radio);	
	}
	
	public static void perimetroCirculo() {
		Scanner pc = new Scanner (System.in);
		System.out.println ("\tIngrese el DIAMETRO: \t\t\t");
		double diametro = pc.nextDouble();
		double radio = diametro/2;
		
		Circulo circulo = new Circulo (diametro, radio);
		double perimetro = circulo.PerimetroCirculo();
		System.out.printf ("\tEL PERIMETRO DEL CIRCULO ES: \n\t\t\t\t" + perimetro);	
	}
	
	public static void areaCirculo() {
		Scanner ac = new Scanner (System.in);
		System.out.printf ("\tIngrese el RADIO: \t\t\t\t");
		double radio = ac.nextDouble();
		double diametro = radio *2;
		
		Circulo circulo = new Circulo (diametro, radio);
		double area = circulo.AreaCirculo();
		System.out.printf ("\tEL AREA DEL CIRCULO ES: \n\t\t\t\t" + area);
	}
}
