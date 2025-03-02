package AppComercio.utilidades;

import AppComercio.modelo.Producto;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Clase de utilidades que proporciona métodos estáticos para realizar operaciones
 * comunes en el manejo de productos.
 */
public class Utilidades {

    /**
     * Muestra la lista de productos filtrados y ordenados por su código en el almacén.
     * <p>
     * Este método filtra los productos nulos de un arreglo, luego los ordena
     * por el código del producto (en orden ascendente) y finalmente muestra
     * la información de cada uno de los productos filtrados.
     * </p>
     *
     * @param productos Arreglo de objetos {@link Producto} a ser mostrados.
     *                 Si algún producto en el arreglo es nulo, será filtrado.
     * @see Producto#mostrarInfo() Método usado para mostrar la información de cada producto.
     */
    public static void mostrarProductos(Producto[] productos) {
        System.out.println("Lista de productos en almacén:");

        // Filtrar productos no nulos y ordenarlos por código
        var productosFiltrados = Arrays.stream(productos)
                .filter(p -> p != null) // Filtrar elementos nulos
                .sorted(Comparator.comparingInt(Producto::getCodProducto)) // Ordenar por código
                .collect(Collectors.toList());

        // Mostrar la información de cada producto
        for (Producto p : productosFiltrados) {
            p.mostrarInfo();
        }
    }
}

