package Banco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Transaccion {
	public static int MIN_CANTIDAD = 500;
    private LocalDateTime fecha;
    private double importe;
    private String tipo; // Puede ser "Depósito" o "Extracción"

    public Transaccion(double importe, String tipo) {
        this.fecha = LocalDateTime.now(); // Dia y hora actual
        this.importe = importe;
        this.tipo = tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getImporte() {
        return importe;
    }

    public String getTipo() {
        return tipo;
    }
    
    // Método abstracto para modificar en las subclases (Deposito y Extraccion)
    public abstract void operar(Cliente cliente);
    
    
    // Método para formatear la fecha y hora del evento como una cadena
    public String obtenerFechaHoraFormateada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return fecha.format(formatter);
    }
 
    public String mostrarTransaccion() {
        return tipo + " de " + importe + " en " + fecha;
    }
}

