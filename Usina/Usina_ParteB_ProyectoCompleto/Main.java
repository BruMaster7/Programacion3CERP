package Usina;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	// Turbinas de la primera Usina
		Turbina turbina = new Turbina(1000.0, true);
	    Turbina turbina2 = new Turbina(2000.0, false);
	    Turbina turbina3 = new TurbinaEspecial (1500.0, true, 2.0);
	    
        ArrayList<Turbina> turbinas = new ArrayList<>();
        turbinas.add(turbina);
        turbinas.add(turbina2);
        turbinas.add(turbina3);
	    
     // Turbinas de la segunda Usina 
        Turbina turbina4 = new Turbina(1000.0, true);
        Turbina turbina5 = new Turbina(2000.0, false);
        TurbinaEspecial turbina6 = new TurbinaEspecial(1500.0, true, 1.2);
        ArrayList<Turbina> listaDeTurbinas = new ArrayList<>();
        listaDeTurbinas.add(turbina4);
        listaDeTurbinas.add(turbina5);
        listaDeTurbinas.add(turbina6);
        
        Usina usina1 = new Usina("Usina Maldonado", turbinas);
        Usina usina2 = new Usina("Usina Rocha", listaDeTurbinas);
        
        Menu menu = new Menu();
        menu.agregarUsina(usina1);
        menu.agregarUsina(usina2);
        
        menu.runMenu();

	}

}
