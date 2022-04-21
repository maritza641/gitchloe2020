
public class JavaBasico {

	public static void main(String[] args) {
		// pruebaBreak();
		pruebaContinue();
	}

	public static void pruebaBreak() {
		for (int i=0; i<10; i++) {
			if (i==4) {
				break;
			}
			System.out.printf("i=%d %n", i);
		}
	}
	
	public static void pruebaContinue() {
		for (int i=0; i<10; i++) {
			if(i==4) {
				continue;
			}
			System.out.printf("i=%d %n",i, null);
		}
	}
}
