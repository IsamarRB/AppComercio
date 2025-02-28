package AppComercio.modelo;

public class NoPerecedero extends Producto {
    public NoPerecedero(String nombre, double precio, int stock) {
        super(codProducto, nombre, precio, stock);
    }

    @Override
    public void actualizarPrecio() {
        precio *= 0.9;
    }
}
