package AppComercio.cliente;

/**
 * Interfaz que define la gestión de clientes en la aplicación de comercio.
 * Proporciona métodos para obtener información del cliente,
 * visualizar el carrito de compras y enviar un pedido.
 */
public interface GestionClientes {

    /**
     * Muestra la información del cliente.
     */
    void infoCliente();

    /**
     * Muestra el contenido del carrito de compras del cliente.
     */
    void mostrarCarrito();

    /**
     * Envía el pedido del cliente.
     */
    void enviarPedido();
}
