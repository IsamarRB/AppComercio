package AppComercio.utilidades;

import AppComercio.modelo.Producto;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Utilidades {
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
