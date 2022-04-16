package EntradaEventoMejorado;

public class Asiento {
		private int numero;
		private Espectador espectador;
		private boolean disponible;
		private String tipo;
		
		public Asiento() {
		}
		
		public Asiento(int numero, boolean disponible, String tipo) {
			this.numero = numero;
			this.espectador = null;
			this.setDisponible(disponible);
			this.tipo = tipo;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Espectador getEspectador() {
			return espectador;
		}

		public void setEspectador(Espectador espectador) {
			this.espectador = espectador;
		}

		public boolean isDisponible() {
			return disponible;
		}

		public void setDisponible(boolean disponible) {
			this.disponible = disponible;
		}
	
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
}			

