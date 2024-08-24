package Usina;

public class Turbina {
	private double potencia;
	private boolean activa;
	
	public Turbina(double potencia, boolean activa) {
		this.potencia = potencia;
		this.activa = activa;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean isActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	public String mostrarTurbina() {
		 return "Turbina[" + "potencia = " + getPotencia() + ", activa = " + isActiva() + "]";
	}
	
	
}
