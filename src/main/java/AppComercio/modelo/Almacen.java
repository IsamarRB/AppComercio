package AppComercio.modelo;

/**
 * Clase que representa un almacén de productos.
 * Contiene un array de productos, incluyendo tanto perecederos como no perecederos.
 */
public class Almacen {
    private Producto[] productos;

    /**
     * Constructor de la clase Almacen.
     * Inicializa el array de productos con capacidad para 10 elementos.
     */
    public Almacen() {
        productos = new Producto[10]; // Inicializar el array de productos
    }

    /**
     * Método para crear y almacenar productos en el almacén.
     * Se inicializan productos perecederos y no perecederos con diferentes atributos.
     */
    public void crearAlmacen() {
        // Productos perecederos
        productos[0] = new Perecedero(101, "Leche entera", 1.25, 10, 10);
        productos[1] = new Perecedero(103, "Yogurt natural", 0.55, 5, 2);
        productos[2] = new Perecedero(122, "Pan de molde", 1.65, 0, 25);
        productos[3] = new Perecedero(115, "Queso curado", 5.25, 10, 3);
        productos[4] = new Perecedero(134, "Huevos", 1.55, 5, 12);

        // Productos no perecederos
        productos[5] = new NoPerecedero(201, "Manta polar", 30.0, 5);
        productos[6] = new NoPerecedero(222, "Cojín floral", 7.55, 10);
        productos[7] = new NoPerecedero(213, "Almohada de plumas", 15.95, 10);
        productos[8] = new NoPerecedero(244, "Sábanas blancas", 22.10, 5);
        productos[9] = new NoPerecedero(205, "Sábanas rosas", 22.10, 0);
    }

    /**
     * Método para obtener el array de productos del almacén.
     *
     * @return Un array de objetos de tipo Producto.
     */
    public Producto[] getProductos() {
        return productos;
    }
}
