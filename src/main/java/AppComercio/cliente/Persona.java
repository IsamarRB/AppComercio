package AppComercio.cliente;

public class Persona {
    private String nomCompleto;
    private String dni;
    private String direccion;
    private String email;
    private int móvil;

    public Persona(String nomCompleto, String dni, String direccion) {
        this.nomCompleto = nomCompleto;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
        this.móvil = móvil;
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

    public String getEmail() {
        return email;
    }

    public int getMóvil() {
        return móvil;
    }
}
