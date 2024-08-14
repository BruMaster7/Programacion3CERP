package Banco;
import java.util.Date;

public class Transaccion {
    private Date fecha;
    private double importe;
    private String tipo; // Puede ser "Depósito" o "Extracción"

    public Transaccion(double importe, String tipo) {
        this.fecha = new Date(); // Dia y hora actual
        this.importe = importe;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getImporte() {
        return importe;
    }

    public String getTipo() {
        return tipo;
    }

 
    public String mostrarTransaccion() {
        return tipo + " de " + importe + " en " + fecha;
    }
}

