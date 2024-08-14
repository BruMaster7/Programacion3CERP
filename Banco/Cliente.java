package Banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int documento;
	private String nombre;
	private String apellido;
	private String direccion;
	private String mail;
	private String telefono;
	private double saldo;
	private List<Transaccion> transacciones;
	
	public Cliente (int documento, String nombre, String apellido, 
					String direccion, String mail, String telefono, double saldo) {
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.mail = mail;
		this.telefono = telefono;
		this.saldo = saldo;
		this.transacciones = new ArrayList<>();
	}
	
	public int getDocumento() {
		return documento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getMail() {
		return mail;
	} 
	
	public String getTelefono() {
		return telefono;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String mostrarCliente() {
		return "[Cliente: " + getNombre() + " " + getApellido() + "] | \n" +
				"[Contacto] mail: " + getMail() + " telefono: " + getTelefono() + 
				"\n[Direccion] " + getDireccion();
	}
	
	public void depositarSaldo(double cantidad) {
		if (cantidad >= 500) {
			saldo += cantidad;
			Transaccion transaccion = new Transaccion(cantidad, "Depósito");
            transacciones.add(transaccion);
			System.out.println(nombre + " ha depositado " + cantidad + ". Saldo actual: " + saldo);
		} else {
			System.out.println("Cantidad a depositar insuficiente, debe ser mayor a $500");
		}
	}
	
	public void extraerSaldo(double cantidad) {
		if (cantidad >= 500 && cantidad <= saldo ) {
			saldo -= cantidad;
			Transaccion transaccion = new Transaccion(cantidad, "Extracción");
            transacciones.add(transaccion);
			System.out.println(nombre + " ha extraído " + cantidad + ". Saldo actual: " + saldo);
		} else if (cantidad > saldo) {
			System.out.println("La cantidad de dinero que usted intenta extraer supera al saldo de su cuenta");
		} else {
			System.out.println("La cantidad ha extraer debe ser positiva");
		}
	}
	
	public String mostrarSaldo() {
		return "[El saldo actual de la cuenta de " + documento + " " + nombre + " " + apellido +
				"] es: " + saldo;
	}
	
	public void mostrarTransacciones() {
		System.out.println("El historial de transacciones de " + nombre + " es: ");
		for (Transaccion transaccion : transacciones) {
			System.out.println(transaccion.mostrarTransaccion());
		}
	}
	
}
