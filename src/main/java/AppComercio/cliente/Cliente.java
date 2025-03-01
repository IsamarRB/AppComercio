package AppComercio.cliente;

import java.util.ArrayList;
import java.util.List;
import AppComercio.modelo.Producto;

public class Cliente implements GestionClientes {
    private Persona persona;
    private List<Producto> carrito;

    public Cliente(Persona persona) {
        this.persona = persona;
        this.carrito = new ArrayList<>();
    }

    @Override
    public void infoCliente() {
        System.out.printf("Cliente: %s | DNI: %s | Dirección: %s\n", persona.getNomCompleto(), persona.getDni(), persona.getDireccion());
    }

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

    @Override
    public void enviarPedido() {
        System.out.printf("Enviando pedido a %s\n", persona.getNomCompleto());
    }

    /**
     * Agrega un producto al carrito y disminuye el stock en la cantidad especificada.
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