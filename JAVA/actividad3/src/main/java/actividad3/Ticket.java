package actividad3;

import java.time.LocalDateTime;

public class Ticket {
	private int numero;
	private LocalDateTime fechahora = LocalDateTime.now();
	private Cliente cliente;
	private Producto producto;
	private Ejecutivo ejecutivo;
	private Ejecutivo rjrcutivoDerivado;
	private String problema;
	private String solucion;
	private String estado;
	
	
	
	public Ticket(int numTicket,  String date, String cliente2, String Producto, String ejecutivo2, String rjrcutivoDerivado2, String problema, String estado, String solucion) {
		super();
		this.setNumero(numero);
		this.setFechahora(fechahora);
		this.setProducto(producto);
		
		this.setProblema(problema);
		this.setSolucion(solucion);
		this.setEstado(estado);
	}
	

	public Ticket() {
	}


	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechahora() {
		return fechahora;
	}
	public void setFechahora(LocalDateTime fechahora) {
		this.fechahora = fechahora;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Ejecutivo getEjecutivo() {
		return ejecutivo;
	}
	public void setEjecutivo(Ejecutivo ejecutivo) {
		this.ejecutivo = ejecutivo;
	}
	public Ejecutivo getRjrcutivoDerivado() {
		return rjrcutivoDerivado;
	}
	public void setRjrcutivoDerivado(Ejecutivo rjrcutivoDerivado) {
		this.rjrcutivoDerivado = rjrcutivoDerivado;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public String getSolucion() {
		return solucion;
	}
	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	

}
