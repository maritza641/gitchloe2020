import java.time.LocalDate;

public class Vehiculo extends Fecha  {
	private String patente;
	private String modelo;
	private String marca;
	private LocalDate fecha;
	
	
	private Cliente dueño;
	
	public Vehiculo()
	{
		super();
	}
	
	public Vehiculo(String patente, String marca, String modelo, LocalDate fecha, Cliente dueño) 
	{
		super();
		this.fecha = fecha;
		this.patente = patente;
		this.modelo = modelo;
		this.marca = marca;
		this.setDueño(dueño);
	}
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Cliente getDueño() 
	{
		return dueño;
	}
	public void setDueño(Cliente dueño) 
	{
		this.dueño = dueño;
	}
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
