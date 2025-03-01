package AppComercio.modelo;

public class NoPerecedero extends Producto {

    // Constructor
    public NoPerecedero(int codProducto, String nombre, double precio, int stock) {
        super(codProducto, nombre, precio, stock);
    }

    // Método actualizarPrecio
    @Override
    public void actualizarPrecio() {
        setPrecio(getPrecio() * 0.9); // Descuento del 10%
    }
}