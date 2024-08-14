package libro_editorial;

public class Libro {
	private String nombre;
	private String isbn;
	private int year;
	private Editorial editorial;
	
	public Libro (String nombre, String isbn, int year, Editorial editorial) {
		this.nombre = nombre;
		this.isbn = isbn;
		this.year = year;
		this.editorial = editorial;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getYear() {
		return year;
	}
	
	public Editorial getEditorial() {
		return editorial;
	}
	
	public String mostrarLibro() {
		return "Libro [nombre: " + nombre + "| isbn: " + isbn + "| año de publicación: " +
				year + "| Editorial: " + editorial.getNombre() + "]";
	}
	
	public String mostrarEditorial() {
		return "Los datos de la editorial del libro: " + nombre + " son: " + editorial.mostrarInfo();
	}
}
