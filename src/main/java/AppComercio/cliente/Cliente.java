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
        carrito.sort((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()));
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

    public void agregarProducto(Producto producto) {
        carrito.add(producto);
    }
}
