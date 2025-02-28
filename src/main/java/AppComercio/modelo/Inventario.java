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
        // Usar subclases de Producto (Perecedero y NoPerecedero)
        agregarProducto(101, new Perecedero("Leche entera", 1.25, 10, 10));
        agregarProducto(103, new Perecedero("Yogurt natural", 0.55, 5, 2));
        agregarProducto(122, new Perecedero("Pan de molde", 1.65, 0, 25));
        agregarProducto(115, new Perecedero("Queso curado", 5.25, 10, 3));
        agregarProducto(134, new Perecedero("Huevos", 1.55, 5, 12));
        agregarProducto(201, new NoPerecedero("Manta polar", 30.0, 5));
        agregarProducto(222, new NoPerecedero("Cojín floral", 7.55, 10));
        agregarProducto(213, new NoPerecedero("Almohada de plumas", 15.95, 10));
        agregarProducto(244, new NoPerecedero("Sábanas blancas", 22.10, 5));
        agregarProducto(205, new NoPerecedero("Sábanas rosas", 22.10, 0));
    }

    // Método para agregar productos al inventario
    public void agregarProducto(int codigo, Producto producto) {
        if (producto == null) {
            System.out.println("Error: El producto no puede ser nulo.");
            return;
        }
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
                    System.out.println("Código: " + codigo + " - " + producto.toString())
            );
        }
    }

    // Método para obtener un producto específico por su código
    public Producto obtenerProducto(int codigo) {
        Producto producto = productos.get(codigo);
        if (producto == null) {
            System.out.println("Advertencia: El producto con código " + codigo + " no existe.");
        }
        return producto;
    }
}