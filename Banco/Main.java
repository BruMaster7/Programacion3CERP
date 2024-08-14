package Banco;

public class Main {

	public static void main(String[] args) {
		Banco banco1 = new Banco("BROU", "Montevideo, Av.Italia");
		
		Cliente cliente1 = new Cliente(55699759, "Bruno", "Rocha", "3 de Febrero S/N",
						"brunorocha1ero4@gmail.com", "44750000", 1000.0);
		Cliente cliente2 = new Cliente(55699759, "Pepe", "Rodriguez", "Av.Inventada Nro.1045",
				"pepe@gmail.com", "44728888", 500.0);
		
		banco1.agregarCliente(cliente1);
		banco1.agregarCliente(cliente2);
		
		banco1.mostrarClientes();
		
		cliente1.extraerSaldo(500);
		cliente1.depositarSaldo(2000);
		
		cliente1.mostrarTransacciones();

	}

}
