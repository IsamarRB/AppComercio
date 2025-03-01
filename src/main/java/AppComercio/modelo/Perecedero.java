package AppComercio.modelo;

public class Perecedero extends Producto {
    private int diasCaducar;

    // Constructor corregido
    public Perecedero(int codProducto, String nombre, double precio, int stock, int diasCaducar) {
        super(nombre, precio, stock); // Llamada al constructor de la superclase (Producto)
        this.diasCaducar = diasCaducar; // Inicialización del atributo específico de Perecedero
    }

    public Perecedero(String leche, double v, int precio, int stock) {
        super(leche, v, precio, stock);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la superclase para mostrar la información común
        System.out.printf("Días para caducar: %d\n", diasCaducar); // Muestra la información específica de Perecedero
    }

    @Override
    public void actualizarPrecio() {
        double nuevoPrecio = getPrecio(); // Obtiene el precio actual usando el getter
        if (diasCaducar <= 2) {
            nuevoPrecio *= 0.7; // Aplica un descuento del 30% si quedan 2 días o menos para caducar
        } else {
            nuevoPrecio *= 0.9; // Aplica un descuento del 10% en otros casos
        }
        setPrecio(nuevoPrecio); // Actualiza el precio usando el setter
    }

    private void setPrecio(double nuevoPrecio) {
    }

    // Getter para díasCaducar
    public int getDiasCaducar() {
        return diasCaducar;
    }

    // Setter para díasCaducar (opcional, si necesitas modificar este valor)
    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }
}