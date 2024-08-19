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
	
    public void incrementarSaldo(double cantidad) {
        saldo += cantidad;
    }

    public void reducirSaldo(double cantidad) {
        saldo -= cantidad;
    }
	
	public String mostrarSaldo() {
		return "[El saldo actual de la cuenta de " + documento + " " + nombre + " " + apellido +
				"] es: " + saldo;
	}

	public void realizarTransaccion(Transaccion transaccion) {
        transaccion.operar(this);
        transacciones.add(transaccion);
        System.out.println(transaccion.mostrarTransaccion() + ". Saldo actual: " + saldo);
    }

	
	public void mostrarTransacciones() {
		System.out.println("El historial de transacciones de " + nombre + " es: ");
		for (Transaccion transaccion : transacciones) {
			System.out.println(transaccion.mostrarTransaccion());
		}
	}
	
}
