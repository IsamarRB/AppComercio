package AppComercio.modelo;

public abstract class Producto {
    private int codProducto; // Código del producto
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(int codProducto, String nombre, double precio, int stock) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método mostrarInfo
    public void mostrarInfo() {
        System.out.printf("Código: %d | Nombre: %s | Precio: %.2f | Stock: %d\n", codProducto, nombre, precio, stock);
    }

    // Getters y setters
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método actualizarPrecio
    public abstract void actualizarPrecio();

    public void disminuirStock() {
    }
}
