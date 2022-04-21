import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
	
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Escribe un tama�o");
		int tam=sn.nextInt();
		
		int matriz1[][]=new int[tam][tam];
		int matriz2[][]=new int[tam][tam];
		
		int resultado[][]=new int[tam][tam];
		
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1[0].length; j++) {
				
				System.out.println("Escriba el valor para la fila "+i+" y la columna "+j+" de la matriz 1");
				matriz1[i][j]=sn.nextInt();
				System.out.println("Escriba el valor para la fila "+i+" y la columna "+j+" de la matriz 2");
				matriz2[i][j]=sn.nextInt();
				
				resultado[i][j]=matriz1[i][j] + matriz2[i][j];
			}
		}
			
		System.out.println("Matriz 1");
		muestraMatriz(matriz1);
		
		System.out.println("Matriz 2");
		muestraMatriz(matriz2);
		
		System.out.println("Matriz resultante");
		muestraMatriz(resultado);	
		
	}
		
	public static void muestraMatriz(int[][] matriz) {
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
		    }
			System.out.println(" ");
		}
	}
}