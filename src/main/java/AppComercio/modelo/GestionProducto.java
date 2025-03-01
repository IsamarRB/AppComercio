package AppComercio.modelo;

public interface GestionProducto {
    // Método mostrarInfo
    void mostrarInfo();

    void incrementarStock(int cantidad);
    void disminuirStock();
    void actualizarPrecio();
}
