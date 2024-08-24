package Usina;

public class TurbinaEspecial extends Turbina{
	private double coef;
	
	public TurbinaEspecial(double potencia, boolean activa, double coef) {
		super(potencia, activa);
		 this.coef =  coef;
	}
	
	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}
	
	@Override
	public double getPotencia() {
		return super.getPotencia() * this.coef; 
	}
}
