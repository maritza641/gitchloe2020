
public class Cliente {
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	private String fono;
	
	public Cliente() 
	{
		
	}

	public Cliente(String rut, String nombre, String apellido, String email, String fono) {
	
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fono = fono;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}	

}
