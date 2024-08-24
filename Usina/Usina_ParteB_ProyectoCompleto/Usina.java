package Usina;

import java.util.ArrayList;

public class Usina {
	private String nombre;
	private ArrayList<Turbina> turbinas;
	
	public Usina(String nombre, ArrayList<Turbina> turbinas) {
		this.nombre = nombre;
		this.turbinas = turbinas;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Turbina> getTurbinas() {
		return turbinas;
	}
	public void setTurbinas(ArrayList<Turbina> turbinas) {
		this.turbinas = turbinas;
	}
	
	public double sumarPotencia() {
		double suma = 0;
		
		for (Turbina turbina : turbinas) {
			if (turbina.isActiva()) {
				suma += turbina.getPotencia();
			}
        }
		
		return suma;
	}
	
    public void mostrarTurbinas() {
        System.out.println("Turbinas en la Usina " + nombre + ":");
        for (Turbina turbina : turbinas) {
            System.out.println(turbina.mostrarTurbina());
        }
    }
	
	
	
	
}
