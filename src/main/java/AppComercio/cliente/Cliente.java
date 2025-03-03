package AppComercio.cliente;

import java.util.ArrayList;
import java.util.List;
import AppComercio.modelo.Producto;

/**
 * La clase Cliente representa un cliente en el sistema de comercio.
 * Un cliente tiene una persona asociada y un carrito de compras.
 * Implementa la interfaz GestionClientes para manejar operaciones relacionadas con el cliente.
 */
public class Cliente implements GestionClientes {

    /** Instancia del cliente (posible error en la declaración, podría no ser necesaria). */
    public Cliente cliente;

    /** Información personal del cliente. */
    private Persona persona;

    /** Lista de productos en el carrito del cliente. */
    private List<Producto> carrito;

    /**
     * Constructor de la clase Cliente.
     *
     * @param persona La persona asociada a este cliente.
     */
    public Cliente(Persona persona) {
        this.persona = persona;
        this.carrito = new ArrayList<>();
    }

    /**
     * Muestra la información del cliente, incluyendo su nombre, DNI y dirección.
     */
    @Override
    public void infoCliente() {
        System.out.printf("Cliente: %s | DNI: %s | Dirección: %s\n",
                persona.getNomCompleto(),
                persona.getDni(),
                persona.getDireccion());
    }

    /**
     * Muestra el contenido del carrito del cliente, ordenado por precio de menor a mayor.
     * También muestra el total a pagar por los productos en el carrito.
     */
    @Override
    public void mostrarCarrito() {
        double total = 0;
        // Ordenar el carrito por precio de menor a mayor
        carrito.sort((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));
        System.out.println("Carrito de compras:");
        for (Producto p : carrito) {
            p.mostrarInfo();
            total += p.getPrecio();
        }
        System.out.printf("Total a pagar: %.2f\n", total);
    }

    /**
     * Envía el pedido del cliente mostrando un mensaje con su nombre.
     */
    @Override
    public void enviarPedido() {
        System.out.printf("Enviando pedido a %s\n", persona.getNomCompleto());
    }

    /**
     * Agrega un producto al carrito en la cantidad especificada.
     *
     * @param producto El producto a agregar al carrito.
     * @param cantidad La cantidad de unidades a agregar.
     */
    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            carrito.add(producto);
        }
        System.out.println("¡¡Producto añadido al carrito!!");
    }
}
