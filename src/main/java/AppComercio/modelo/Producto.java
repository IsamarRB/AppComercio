package AppComercio.modelo;

public abstract class Producto implements GestionProducto {
    private int codProducto;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.printf("Código: %d | Nombre: %s | Precio: %.2f | Stock: %d\n", codProducto, nombre, precio, stock);
    }

    // Método incrementarStock
    @Override
    public void incrementarStock(int cantidad) {
        this.stock += cantidad;
    }

    // Método disminuirStock
    @Override
    public void disminuirStock() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("No hay suficiente stock para disminuir.");
        }
    }

    // Getters y setters
    // Método setPrecio
    public void setPrecio(double precio) {
        this.precio = precio;
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

    // Método toString
    @Override
    public String toString() {
        return nombre + " - Precio: $" + precio + " - Stock: " + stock;
    }
}
