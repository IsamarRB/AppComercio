package AppComercio.modelo;

/**
 * Representa un producto no perecedero en el sistema de comercio.
 * Hereda de la clase {@code Producto} y aplica un descuento del 10%
 * cuando se actualiza su precio.
 *
 * @author [Tu Nombre]
 */
public class NoPerecedero extends Producto {

    /**
     * Constructor de la clase NoPerecedero.
     *
     * @param codProducto Código único del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio inicial del producto.
     * @param stock Cantidad disponible en stock.
     */
    public NoPerecedero(int codProducto, String nombre, double precio, int stock) {
        super(codProducto, nombre, precio, stock);
    }

    /**
     * Aplica un descuento del 10% al precio actual del producto.
     * Este método sobrescribe la implementación en la clase base {@code Producto}.
     */
    @Override
    public void actualizarPrecio() {
        setPrecio(getPrecio() * 0.9);
    }
}
