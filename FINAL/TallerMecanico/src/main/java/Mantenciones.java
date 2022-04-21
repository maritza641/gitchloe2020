
public class Mantenciones {
	
	private String mantencionesRealizadas;
	private String observaciones;
	private int montoServicio;
	private boolean mantencione;
	
	private Vehiculo vehiculo;
	
	public Mantenciones() 
	{
		
	}
	

	public Mantenciones(boolean mantencione, String mantencionesRealizadas, String observaciones, int montoServicio, Vehiculo vehiculo) {
		super();
		this.mantencionesRealizadas = mantencionesRealizadas;
		this.observaciones = observaciones;
		this.montoServicio = montoServicio;
		this.setVehiculo(vehiculo);
		this.setMantencione(mantencione);
	}


	public boolean isMantencione() {
		return mantencione;
	}


	public void setMantencione(boolean mantenciones) {
		this.mantencione = mantenciones;
	}


	public String getMantencionesRealizadas() {
		return mantencionesRealizadas;
	}

	public void setMantencionesRealizadas(String mantencionesRealizadas) {
		this.mantencionesRealizadas = mantencionesRealizadas;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getMontoServicio() {
		return montoServicio;
	}

	public void setMontoServicio(int montoServicio) {
		this.montoServicio = montoServicio;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	

}
