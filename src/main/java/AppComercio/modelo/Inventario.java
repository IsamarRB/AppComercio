package AppComercio.modelo;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<Integer, Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new HashMap<>();
        inicializarInventario();
    }

    // Método para inicializar los productos en el inventario
    private void inicializarInventario() {
        agregarProducto(101, new Producto("Leche entera", 1.25, 10, 10));
        agregarProducto(103, new Producto("Yogurt natural", 0.55, 5, 2));
        agregarProducto(122, new Producto("Pan de molde", 1.65, 0, 25));
        agregarProducto(115, new Producto("Queso curado", 5.25, 10, 3));
        agregarProducto(134, new Producto("Huevos", 1.55, 5, 12));
        agregarProducto(201, new Producto("Manta polar", 30.0, 5, null));
        agregarProducto(222, new Producto("Cojín floral", 7.55, 10, null));
        agregarProducto(213, new Producto("Almohada de plumas", 15.95, 10, null));
        agregarProducto(244, new Producto("Sábanas blancas", 22.10, 5, null));
        agregarProducto(205, new Producto("Sábanas rosas", 22.10, 0, null));
    }

    // Método para agregar productos al inventario
    public void agregarProducto(int codigo, Producto producto) {
        if (!productos.containsKey(codigo)) {
            productos.put(codigo, producto);
        } else {
            System.out.println("Error: El producto con código " + codigo + " ya existe.");
        }
    }

    // Método para eliminar un producto del inventario
    public void eliminarProducto(int codigo) {
        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
            System.out.println("Producto con código " + codigo + " eliminado.");
        } else {
            System.out.println("Error: El producto con código " + codigo + " no existe.");
        }
    }

    // Método para mostrar todos los productos en el inventario
    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            productos.forEach((codigo, producto) ->
                    System.out.println("Código: " + codigo + " - " + producto)
            );
        }
    }

    // Método para obtener un producto específico por su código
    public Producto obtenerProducto(int codigo) {
        return productos.getOrDefault(codigo, null);
    }
}