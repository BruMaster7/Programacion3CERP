package libro_editorial;

public class Main {

	public static void main(String[] args) {
		Editorial editorial1 = new Editorial("Santillana", 
				"Juan Manuel Blanes 1132 11200. Montevideo, Uruguay",
				24107342);
		Editorial editorial2 = new Editorial("Ediciones Ekaré", 
				"Av. Luis Roche, Edif. Banco del Libro Altamira Sur. Caracas 1062, Venezuela", 
				934152156);
		
		
		Libro libro1 = new Libro("Aprende a Programar", "123-456-789-12", 2019, editorial1);
		Libro libro2 = new Libro("El hijo del Astronauta", "978-84-128118-0-3", 2014, editorial2);
		
		System.out.println(libro1.mostrarLibro());
		System.out.println(libro1.mostrarEditorial());
		
		System.out.println(libro2.mostrarLibro());
		System.out.println(libro2.mostrarEditorial());
		

	}

}
