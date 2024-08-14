package Banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nombre;
	private String direccion;
	private List<Cliente> clientes;
	
	public Banco(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.clientes = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void mostrarClientes() {
		System.out.println("La cartera de clientes del banco " + nombre + " es: ");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.mostrarCliente()+ cliente.mostrarSaldo());
		}
	}
}
