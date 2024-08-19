package Banco;

public class Extraccion extends Transaccion  {

	public Extraccion(double importe) {
		super(importe, "Extracción");
	}


	@Override
	public void operar(Cliente cliente) {
		if (cliente.getSaldo() >= getImporte()) {
			cliente.reducirSaldo(getImporte());
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	
	
}
