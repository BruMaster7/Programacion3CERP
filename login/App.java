package login;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	private Map<String, Usuario> usuarios;
	
	public App() {
		usuarios = new HashMap<>();
		
		usuarios.put("Bru", new Usuario("Bru", "1234"));
		usuarios.put("userPrueba", new Usuario("userPrueba", "5678"));
	}
	
	 public void run() {
		 	Scanner scanner = new Scanner(System.in);
		 	boolean continuar = true;
		 	
		 	while (continuar) {
		        System.out.println("Hola, inicie sesión para continuar");
	
		        System.out.print("Ingrese su nickname: ");
		        String nickname = scanner.nextLine();
	
		        if (usuarios.containsKey(nickname)) {
		          
		        	Usuario usuario = usuarios.get(nickname);
		            boolean loginExitoso = usuario.login();
		            
		            if (loginExitoso) {
		                System.out.println("¡Inicio de sesión exitoso!");
		            } else {
		                System.err.println("Ha alcanzado el número máximo de intentos. USUARIO BLOQUEADO, Por favor, intente más tarde.");
		            }
		        } else {
		            System.err.println("El usuario no existe. Verifique el nickname e intente nuevamente.");
		        }
	            if (continuar) {
	                System.out.print("¿Desea intentar nuevamente? (S/N): ");
	                String respuesta = scanner.nextLine();
	                continuar = respuesta.equalsIgnoreCase("S");
	            }
	        
		 	}

	        scanner.close();
	    }
}
