import java.time.LocalDate;

public class Vehiculo extends Fecha  {
	private String patente;
	private String modelo;
	private String marca;
	private LocalDate fecha;
	
	
	private Cliente due�o;
	
	public Vehiculo()
	{
		super();
	}
	
	public Vehiculo(String patente, String marca, String modelo, LocalDate fecha, Cliente due�o) 
	{
		super();
		this.fecha = fecha;
		this.patente = patente;
		this.modelo = modelo;
		this.marca = marca;
		this.setDue�o(due�o);
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

	public Cliente getDue�o() 
	{
		return due�o;
	}
	public void setDue�o(Cliente due�o) 
	{
		this.due�o = due�o;
	}
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
