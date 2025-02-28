package AppComercio;

import AppComercio.cliente.Cliente;
import AppComercio.cliente.Persona;
import AppComercio.modelo.NoPerecedero;
import AppComercio.modelo.Perecedero;
import AppComercio.modelo.Producto;
import AppComercio.utilidades.Utilidades;

import java.util.Scanner;

public class AppComercio {
    public static void main(String[] args) {
        Producto[] almacen = {
                new Perecedero(101, "Leche", 1.25, 10, 10),
                new NoPerecedero(201, "Manta", 30.0, 5)
        };

        Persona persona = new Persona("Rodrigo Tapias", "11.111.111-H", "Calle Federico García Lorca, 3");
        Cliente cliente = new Cliente(persona);

        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            Utilidades.mostrarProductos(almacen);
            System.out.println("Ingrese código de producto a comprar (o 'salir' para finalizar):");
            opcion = scanner.nextLine();
            for (Producto p : almacen) {
                if (String.valueOf(p.getCodProducto()).equals(opcion)) {
                    cliente.agregarProducto(p);
                    break;
                }
            }
        } while (!opcion.equalsIgnoreCase("salir"));

        cliente.mostrarCarrito();
        cliente.enviarPedido();
        scanner.close();
    }
}
