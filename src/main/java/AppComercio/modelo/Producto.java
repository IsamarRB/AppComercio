package AppComercio.modelo;

/**
 * Clase abstracta que representa un producto en un comercio.
 * Contiene información básica sobre un producto como el código, nombre, precio y stock.
 * Además, proporciona métodos para manejar el stock y actualizar el precio.
 */
public abstract class Producto {

    /** El código único del producto */
    private int codProducto;

    /** El nombre del producto */
    private String nombre;

    /** El precio del producto */
    private double precio;

    /** La cantidad disponible del producto en stock */
    private int stock;

    /**
     * Constructor de la clase Producto.
     *
     * @param codProducto Código único del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad inicial en stock del producto.
     */
    public Producto(int codProducto, String nombre, double precio, int stock) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Disminuye el stock del producto en una cantidad específica.
     *
     * @param cantidad Cantidad a restar del stock.
     * @throws IllegalArgumentException Si la cantidad es mayor que el stock disponible.
     */
    public void disminuirStock(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock para disminuir.");
        }
    }

    /**
     * Incrementa el stock del producto en una cantidad específica.
     *
     * @param cantidad Cantidad a agregar al stock.
     */
    public void incrementarStock(int cantidad) {
        stock += cantidad;
    }

    /**
     * Método abstracto para actualizar el precio del producto.
     * Este método debe ser implementado en las subclases para definir cómo actualizar el precio.
     */
    public abstract void actualizarPrecio();

    /**
     * Muestra la información básica del producto (código, nombre, precio y stock).
     */
    public void mostrarInfo() {
        System.out.printf("Código: %d | Nombre: %s | Precio: %.2f | Stock: %d\n", codProducto, nombre, precio, stock);
    }

    /**
     * Obtiene el código único del producto.
     *
     * @return El código del producto.
     */
    public int getCodProducto() {
        return codProducto;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la cantidad en stock del producto.
     *
     * @return La cantidad de stock disponible.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
