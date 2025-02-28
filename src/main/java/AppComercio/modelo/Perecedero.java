package AppComercio.modelo;

public class Perecedero extends Producto{
    private int diasCaducar;

    public Perecedero(int codProducto, String nombre, double precio, int stock, int diasCaducar) {
        super(codProducto, nombre, precio, stock);
        this.diasCaducar = diasCaducar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("Días para caducar: %d\n", diasCaducar);
    }

    @Override
    public void actualizarPrecio() {
        if (diasCaducar <= 2) {
            precio *= 0.7;
        } else {
            precio *= 0.9;
        }
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }
}
