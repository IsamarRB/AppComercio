package AppComercio.cliente;

public class Persona {
    private String nomCompleto;
    private String dni;
    private String direccion;

    public Persona(String nomCompleto, String dni, String direccion) {
        this.nomCompleto = nomCompleto;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }
}
