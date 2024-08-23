package Banco;

public class Deposito extends Transaccion{

	public Deposito(double importe) {
		super(importe, "Depósito");
	}
	
	
	
	@Override
	public void operar(Cliente cliente) {
		if (getImporte() >= MIN_CANTIDAD) {
		cliente.incrementarSaldo(getImporte());	
		} else {
			System.out.println("Importe insuficiente, debe ser igual o mayor a $" + MIN_CANTIDAD);
		}
	}
	
	
}

