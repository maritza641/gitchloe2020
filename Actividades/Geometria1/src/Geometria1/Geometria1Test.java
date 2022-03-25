package Geometria1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Geometria1Test {

	@Test
	
	void testRadio() {
		
		double diametro = 30;
		double radio = diametro/2;
		
		Circulo circulo = new Circulo(diametro, radio);
		radio = circulo.RadioCirculo();
		assertEquals(radio, 15);
	}

	@Test
	
	void testAreaRectangulo() {
		
		double base = 6;
		double altura = 8;
		
		Rectangulo rectangulo = new Rectangulo(base, altura);
		double area =rectangulo.AreaRectangulo();
		assertEquals(area, 48);					
	}

	@Test
	
	void testPerimetroCirculo() {
		
		double diametro = 20;
		double radio = diametro/2;
		
		Circulo circulo = new Circulo(diametro, radio);
		double perimetro = circulo.PerimetroCirculo();
		assertEquals(perimetro, 62.83185307179586);
	}
	
	@Test
	
	void testAreaCirculo() {
		
		double diametro = 11.2;
		double radio = diametro/2;
		
		Circulo circulo = new Circulo(diametro, radio);
		double area = circulo.AreaCirculo();
		assertEquals(area, 98.5203456165759);		
	}
}



