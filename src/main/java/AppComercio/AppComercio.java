package AppComercio;

import AppComercio.cliente.Cliente;
import AppComercio.cliente.Persona;
import AppComercio.modelo.Almacen;
import AppComercio.modelo.Producto;
import AppComercio.utilidades.Utilidades;

import java.util.Scanner;

public class AppComercio {
    public static void main(String[] args) {
        // Crear una instancia de Almacen
        Almacen almacen = new Almacen();
        almacen.crearAlmacen(); // Llenar el array de productos

        // Obtener el array de productos
        Producto[] productos = almacen.getProductos();

        // Crear una persona y un cliente
        Persona persona = new Persona("Alessia Romero", "11.111.111-H", "Calle Federico García Lorca, 3");
        Cliente cliente = new Cliente(persona);

        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            // Mostrar los productos disponibles
            Utilidades.mostrarProductos(productos);

            System.out.println("Ingrese código de producto a comprar (o 'salir' para finalizar):");
            opcion = scanner.nextLine();

            if (!opcion.equalsIgnoreCase("salir")) {
                try {
                    int codigoProducto = Integer.parseInt(opcion); // Convertir la entrada a número
                    boolean productoEncontrado = false;

                    // Buscar el producto por su código
                    for (Producto p : productos) {
                        if (p != null && p.getCodProducto() == codigoProducto) {
                            cliente.agregarProducto(p);
                            productoEncontrado = true;
                            System.out.println("Producto agregado al carrito: " + p.getNombre());
                            break;
                        }
                    }

                    if (!productoEncontrado) {
                        System.out.println("Producto no encontrado. Intente de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Ingrese un número válido o 'salir'.");
                }
            }
        } while (!opcion.equalsIgnoreCase("salir"));

        // Mostrar el carrito del cliente
        cliente.mostrarCarrito();

        scanner.close();
    }
}