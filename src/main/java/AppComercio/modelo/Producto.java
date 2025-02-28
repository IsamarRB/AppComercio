package AppComercio.modelo;

public abstract class Producto implements GestionProducto {
    protected int codProducto;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(int codProducto, String nombre, double precio, int stock) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo() {
        System.out.printf("Código: %d | Nombre: %s | Precio: %.2f | Stock: %d\n", codProducto, nombre, precio, stock);
    }

    public void incrementarStock(int cantidad) {
        this.stock += cantidad;
    }

    public void disminuirStock() {
        if (stock > 0) {
            stock--;
        }
    }
}
