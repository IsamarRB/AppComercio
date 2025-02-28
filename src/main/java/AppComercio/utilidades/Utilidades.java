package AppComercio.utilidades;

import AppComercio.modelo.Producto;
import java.util.Arrays;

public class Utilidades {
    public static void mostrarProductos(Producto[] productos) {
        System.out.println("Lista de productos en almacén:");
        Arrays.sort(productos, (p1, p2) -> Integer.compare(p1.getCodProducto(), p2.getCodProducto()));
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}
