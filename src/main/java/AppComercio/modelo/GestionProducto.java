package AppComercio.modelo;

/**
 * Interfaz que define las operaciones de gestión de productos en la aplicación de comercio.
 */
public interface GestionProducto {

    /**
     * Muestra la información del producto.
     */
    void mostrarInfo();

    /**
     * Incrementa el stock del producto en la cantidad especificada.
     *
     * @param cantidad la cantidad en la que se incrementará el stock
     */
    void incrementarStock(int cantidad);

    /**
     * Disminuye el stock del producto en una unidad.
     */
    void disminuirStock();

    /**
     * Actualiza el precio del producto.
     */
    void actualizarPrecio();
}
