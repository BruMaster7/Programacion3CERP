package Usina;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Usina> usinas;
	
    public Menu() {
        this.usinas = new ArrayList<>();
    }

    public void agregarUsina(Usina usina) {
        usinas.add(usina);
    }

    public void mostrarUsinas() {
        System.out.println("Usinas disponibles:");
        for (int i = 0; i < usinas.size(); i++) {
            System.out.println((i + 1) + ". " + usinas.get(i).getNombre());
        }
    }
    
    public void calcularPotenciaUsina() {
        Scanner scanner = new Scanner(System.in);
        mostrarUsinas();

        System.out.print("Seleccione el número de la usina para calcular la potencia total: ");
        int opcion = scanner.nextInt();

        if (opcion > 0 && opcion <= usinas.size()) {
            Usina usinaSeleccionada = usinas.get(opcion - 1);
            double potenciaTotal = usinaSeleccionada.sumarPotencia();
            System.out.println("La potencia total de las turbinas de la usina " + 
            					usinaSeleccionada.getNombre() + " es: " + potenciaTotal 
            					+ " unidades.");
        } else {
            System.out.println("Opción no válida. Por favor, intente nuevamente.");
        }
    }
    
    
	public void runMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
	        System.out.println("╔════════════════════════════════════════╗");
	        System.out.println("║            SISTEMA USINAS              ║");
	        System.out.println("╠════════════════════════════════════════╣");
	        System.out.println("║ 1. Ver usinas                          ║");
	        System.out.println("║ 2. Mostrar potencia total de Usina     ║");
	        System.out.println("║ 0. Salir                               ║");
	        System.out.println("╚════════════════════════════════════════╝");
	        System.out.print("Seleccione una opción: ");
	        opcion = scanner.nextInt();
	        
	        switch (opcion) {
	        case 1:
	        	mostrarUsinas();
	            break;
	
	        case 2:
	        	calcularPotenciaUsina();
	            break;
	            
	        case 0:
	            System.out.println("Gracias por utilizar el sistema de usinas. ¡Hasta luego!");
	            break;
	
	        default:
	            System.out.println("Opción no válida, por favor intente nuevamente.");
	            break;
        
	      }
        
        } while (opcion != 0);
		
		scanner.close();	}
}
