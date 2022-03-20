package actividad3;

public class Cliente {
	
	private String rut;
	private String nombre;
	private String telefono;
	private String email;
	
	public Cliente(String rut, String nombre, String telefono, String email) {
		
		this.setRut(rut);
		this.setNombre(nombre);
		this.setTelefono(telefono);
		this.setEmail(email);
	}


	public Cliente() {
		super();
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
