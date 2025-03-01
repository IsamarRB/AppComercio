package AppComercio.modelo;

public class Perecedero extends Producto {
    private int diasCaducar;

    // Constructor
    public Perecedero(int codProducto, String nombre, double precio, int stock, int diasCaducar) {
        super(codProducto, nombre, precio, stock);
        this.diasCaducar = diasCaducar;
    }

    // Método actualizarPrecio
    @Override
    public void actualizarPrecio() {
        if (diasCaducar <= 2) {
            setPrecio(getPrecio() * 0.7); // Descuento del 30%
        } else {
            setPrecio(getPrecio() * 0.9); // Descuento del 10%
        }
    }

    // Getter y setter para diasCaducar
    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }
}