package login;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;

public class Usuario {
	private String nick;
	private String pass;
	private int intentosFallidos;
	private boolean bloqueado;
    private LocalDateTime tiempoDesbloqueo;


	
	public Usuario (String nick, String pass) {
		this.nick = nick;
		this.pass = pass;
        this.intentosFallidos = 0;
        this.bloqueado = false;
	}
	
	public boolean login () {
		 Scanner scanner = new Scanner(System.in);
		 
	       if (bloqueado) {
	           if (LocalDateTime.now().isAfter(tiempoDesbloqueo)) {
	               bloqueado = false;
	           } else {
	        	   // long sirve para almacenar numeros enteros mas grandes de lo comun, por eso lo uso para manejar el tiempo
	        	   // Para evitar errores
	        	   // A su vez between() es un metodo de la clase Duration para comparar si la diferencia de tiempo entre
	        	   // El horario actual, y el horario en el que el usuario quedo bloqueado + 3 minutos, es de 3 minutos o mas 
	               long minutosRestantes = Duration.between(LocalDateTime.now(), tiempoDesbloqueo).toMinutes();
	               System.err.println("El usuario está bloqueado. Intente nuevamente en " + minutosRestantes + " minutos.");
	               return false;
	           }
	       }
		 
	       while (this.intentosFallidos < 3) {
	           System.out.print("Ingrese su contraseña: ");
	           String password = scanner.nextLine();

	            if (this.pass.equals(password)) {
	                System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + nick + "!");
	                return true; // Retorna true si el login es exitoso
	            } else {
	                System.err.println("Inicio de sesión fallido. Intente nuevamente.");
	                System.err.println("Numero de intentos: " + this.intentosFallidos);
	                this.intentosFallidos++;
	            }
	
	            if (this.intentosFallidos >= 3) {
	                this.bloqueado = true;
	                this.tiempoDesbloqueo = LocalDateTime.now().plusMinutes(3);
	                return false;
	            }
	     }

	       return false; // Retorna false si no se logra iniciar sesión después de 3 intentos
    }
}
	

