package AppComercio.modelo;

public abstract class Producto implements GestionProducto {
    protected int codProducto;
    protected String nombre;
    protected double precio;
    protected int stock;
    protected Integer diasCaducidad;


    public Producto(int codProducto, String nombre, double precio, int stock) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.diasCaducidad = diasCaducidad;

    }

    @Override
    public String toString() {
        return nombre + " - Precio: $" + precio + " - Stock: " + stock +
                (diasCaducidad != null ? " - Días para caducar: " + diasCaducidad : "");
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

    public int getCodProducto() {
        return codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
