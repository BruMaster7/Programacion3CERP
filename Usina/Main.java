package Usina;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	    Turbina turbina = new Turbina(1000.0, true);
	    Turbina turbina2 = new Turbina(2000.0, false);
	    Turbina turbina3 = new TurbinaEspecial (1500.0, true, 2.0);
	    
        ArrayList<Turbina> turbinas = new ArrayList<>();
        turbinas.add(turbina);
        turbinas.add(turbina2);
        turbinas.add(turbina3);
	    
		Usina usina = new Usina("Usina 1", turbinas);
		
		System.out.println("Nombre de la Usina: " + usina.getNombre());
        usina.mostrarTurbinas();
        System.out.println("La suma de la potencia de las turbinas es: " + usina.sumarPotencia());

	}

}
