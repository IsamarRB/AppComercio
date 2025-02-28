package AppComercio.modelo;

public interface GestionProducto {
    void incrementarStock(int cantidad);
    void disminuirStock();
    void actualizarPrecio();
}
