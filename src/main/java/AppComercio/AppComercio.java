package AppComercio;

import AppComercio.cliente.Cliente;
import AppComercio.cliente.Persona;
import AppComercio.modelo.Inventario;
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

        Inventario inventario = new Inventario();
        inventario.mostrarInventario(); // Muestra la lista de productos

        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            Utilidades.mostrarProductos(almacen);
            System.out.println("Ingrese código de producto a comprar (o 'salir' para finalizar):");
            opcion = scanner.nextLine();
            if (!opcion.equalsIgnoreCase("salir")) {
                boolean productoEncontrado = false;
                for (Producto p : almacen) {
                    if (String.valueOf(p.getCodProducto()).equals(opcion)) {
                        cliente.agregarProducto(p);
                        productoEncontrado = true;
                        break;
                    }
                }
                if (!productoEncontrado) {
                    System.out.println("Producto no encontrado. Intente de nuevo.");
                }
            }
        } while (!opcion.equalsIgnoreCase("salir"));

        cliente.mostrarCarrito();
        // cliente.enviarPedido(); // Si no está implementado, elimina esta línea
        scanner.close();
    }
}
