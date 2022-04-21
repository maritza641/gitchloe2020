import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemuneracionTest {

	@Test
	void testCalculoRemuneracionNoImponible() {
		Colaborador colaborador = new Colaborador();
		colaborador.setSueldoBase (500000);
		colaborador.setMovilizacion (50000);
		colaborador.setColacion (60000);
		LiquidacionSueldo liquidacionSueldo = new LiquidacionSueldo (colaborador);
		int montoNoImponible = liquidacionSueldo.calcularMontoNoImponible();
		assertEquals (montoNoImponible, 110000);
	}
}
