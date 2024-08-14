package libro_editorial;

public class Editorial {
	private String nombre;
	private String direccion;
	private int telefono;
	
	public Editorial(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int telefono() {
		return telefono;
	}
	
	public String mostrarInfo() {
		return "Editorial [nombre: " + nombre + "| direccion: " + direccion + 
				"| telefono: " + telefono + "]";
	}
	
}
