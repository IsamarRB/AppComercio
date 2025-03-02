package AppComercio.modelo;

/**
 * Representa un producto perecedero, que es un tipo de {@link Producto} con una fecha de caducidad.
 * Este tipo de producto tiene descuentos en función de los días que le quedan antes de caducar.
 */
public class Perecedero extends Producto {

    /**
     * Número de días restantes antes de que el producto caduque.
     */
    private int diasCaducar;

    /**
     * Constructor de la clase Perecedero.
     *
     * @param codProducto Código único del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad disponible en inventario.
     * @param diasCaducar Número de días antes de que el producto caduque.
     */
    public Perecedero(int codProducto, String nombre, double precio, int stock, int diasCaducar) {
        super(codProducto, nombre, precio, stock);
        this.diasCaducar = diasCaducar;
    }

    /**
     * Actualiza el precio del producto en función de los días restantes antes de caducar.
     * Si quedan 2 días o menos para su caducidad, se aplica un descuento del 30%.
     * En caso contrario, se aplica un descuento del 10%.
     */
    @Override
    public void actualizarPrecio() {
        if (diasCaducar <= 2) {
            setPrecio(getPrecio() * 0.7); // Descuento del 30%
        } else {
            setPrecio(getPrecio() * 0.9); // Descuento del 10%
        }
    }

    /**
     * Obtiene el número de días restantes antes de que el producto caduque.
     *
     * @return Número de días antes de la caducidad del producto.
     */
    public int getDiasCaducar() {
        return diasCaducar;
    }

    /**
     * Establece el número de días antes de que el producto caduque.
     *
     * @param diasCaducar Número de días hasta la caducidad.
     */
    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }
}
