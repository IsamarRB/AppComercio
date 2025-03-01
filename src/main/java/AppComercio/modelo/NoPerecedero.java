package AppComercio.modelo;

public class NoPerecedero extends Producto {
    public NoPerecedero(int codProducto, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    public NoPerecedero(String manta, double v, int precio) {
        super(manta, v, precio);
    }

    @Override
    public void actualizarPrecio() {
        precio *= 0.9;
    }
}
