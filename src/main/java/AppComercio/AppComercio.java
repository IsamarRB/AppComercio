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
        Persona persona = new Persona("Rodrigo Tapias Herrero", "11.111.111-H", "Calle Federico García Lorca, 3");
        Cliente cliente = new Cliente(persona);

        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            // Mostrar los productos disponibles
            Utilidades.mostrarProductos(productos);

            System.out.println("Para iniciar la compra ingrese código de producto a comprar (o 'salir' para finalizar):");
            opcion = scanner.nextLine();

            if (!opcion.equalsIgnoreCase("salir")) {
                try {
                    int codigoProducto = Integer.parseInt(opcion); // Convertir la entrada a número
                    boolean productoEncontrado = false;

                    // Buscar el producto por su código
                    for (Producto p : productos) {
                        if (p != null && p.getCodProducto() == codigoProducto) {
                            productoEncontrado = true;

                            // Pedir la cantidad al usuario
                            System.out.println("Ingrese la cantidad que desea agregar al carrito:");
                            int cantidad = Integer.parseInt(scanner.nextLine());

                            // Verificar si la cantidad es válida
                            if (cantidad <= 0) {
                                System.out.println("La cantidad debe ser mayor que 0.");
                            } else if (p.getStock() >= cantidad) {
                                // Aplicar descuento (si corresponde)
                                p.actualizarPrecio();

                                // Añadir el producto al carrito del cliente (en la cantidad especificada)
                                cliente.agregarProducto(p, cantidad);

                                // Disminuir el stock en la cantidad especificada
                                p.disminuirStock(cantidad);

                                System.out.println(cantidad + " unidades de " + p.getNombre() + " agregadas al carrito.");
                            } else {
                                System.out.println("¡¡No hay stock suficiente!!");
                                p.incrementarStock(5); // Incrementar el stock en 5 unidades
                                System.out.println("Se han añadido 5 unidades más al stock del producto.");
                            }
                            break; // Salir del bucle una vez que se ha encontrado el producto
                        }
                    }

                    if (!productoEncontrado) {
                        System.out.println("¡¡No existe el producto en el almacén!!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Ingrese un número válido.");
                }
            }
        } while (!opcion.equalsIgnoreCase("salir"));

        // Mostrar el carrito del cliente
        cliente.mostrarCarrito();

        // Enviar el pedido al cliente
        cliente.infoCliente();
        cliente.enviarPedido();

        System.out.println("Compra finalizada ¡Gracias por comprar en Swally Store!");

        // Mostrar la lista actualizada de productos con el stock modificado
        System.out.println("\nLista actualizada de productos en el almacén:");
        Utilidades.mostrarProductos(productos);

        scanner.close();
    }
}