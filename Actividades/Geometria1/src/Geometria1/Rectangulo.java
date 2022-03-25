package Geometria1;

public class Rectangulo {

	private double base;
	private double altura;
	
	//contructores
	public Rectangulo() {
	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	//Calculo de Area
	public double AreaRectangulo() {
		return this.base * this.altura;
	}
	
	
	//getters & setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	

	
}
