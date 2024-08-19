package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco BROU", "Avenida Italia 123");

        Cliente cliente = new Cliente(12345678, "Fulano", "De Tal", "Calle 19 de Abril 123", "fulano@gmail.com", "099123456", 1000.0);
        banco.agregarCliente(cliente);

        int opcion;

        do {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║           SISTEMA BANCARIO             ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1. Realizar Depósito                   ║");
            System.out.println("║ 2. Realizar Extracción                 ║");
            System.out.println("║ 3. Mostrar Saldo                       ║");
            System.out.println("║ 4. Mostrar Historial de Transacciones  ║");
            System.out.println("║ 5. Mostrar Clientes                    ║");
            System.out.println("║ 0. Salir                               ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double importe = scanner.nextDouble();
                    Transaccion transaccionDeposito = new Deposito(importe);
                    cliente.realizarTransaccion(transaccionDeposito);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a extraer: ");
                    double extraccion = scanner.nextDouble();
                    Transaccion transaccionExtraccion = new Extraccion(extraccion);
                    cliente.realizarTransaccion(transaccionExtraccion);
                    break;

                case 3:
                    System.out.println(cliente.mostrarSaldo());
                    break;

                case 4:
                    cliente.mostrarTransacciones();
                    break;

                case 5:
                    banco.mostrarClientes();
                    break;

                case 0:
                    System.out.println("Gracias por utilizar el sistema bancario. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }

            System.out.println(); // Espacio entre las opciones del menú

        } while (opcion != 0);

        scanner.close();
    }
}

