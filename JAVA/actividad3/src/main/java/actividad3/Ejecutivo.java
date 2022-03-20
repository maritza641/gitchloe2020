package actividad3;

public class Ejecutivo {
	private int id;
	private String rut;
	private String nombre;
	private char tipo;
	
	
	
	
	public Ejecutivo(int id, String rut, String nombre, char tipo) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.tipo = tipo;
	}


	public Ejecutivo() {
	}
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

}
