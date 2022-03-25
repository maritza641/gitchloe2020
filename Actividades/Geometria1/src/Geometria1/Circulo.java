package Geometria1;

public class Circulo {

	private double diametro;
	private double radio;
	

	//constructores
	public Circulo() {
	}

	public Circulo(double diametro, double radio) {
		this.diametro = diametro;
		this.radio = radio;
	}
	
	
	
	//Calculo de Area
	public double AreaCirculo() {
		double radio = this.radio;
		return Math.PI * Math.pow (radio, 2);
	}
	
	public double RadioCirculo() {
		return this.diametro/2;
	}
	
	public double PerimetroCirculo() {
		return Math.PI * this.diametro;
	}
	
	//getters & setters
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
