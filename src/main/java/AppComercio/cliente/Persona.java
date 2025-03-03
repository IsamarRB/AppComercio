package AppComercio.cliente;

/**
 * Representa una persona con nombre completo, DNI, dirección, email y número móvil.
 */
public class Persona {
    private String nomCompleto;
    private String dni;
    private String direccion;
    private String email;
    private int móvil;

    /**
     * Constructor para crear una instancia de Persona.
     *
     * @param nomCompleto Nombre completo de la persona.
     * @param dni Documento Nacional de Identidad de la persona.
     * @param direccion Dirección de residencia de la persona.
     */
    public Persona(String nomCompleto, String dni, String direccion) {
        this.nomCompleto = nomCompleto;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email; // Estas variables no están inicializadas correctamente
        this.móvil = móvil;
    }

    /**
     * Obtiene el nombre completo de la persona.
     *
     * @return El nombre completo.
     */
    public String getNomCompleto() {
        return nomCompleto;
    }

    /**
     * Obtiene el DNI de la persona.
     *
     * @return El DNI de la persona.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene la dirección de la persona.
     *
     * @return La dirección de la persona.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el email de la persona.
     *
     * @return El email de la persona.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Obtiene el número móvil de la persona.
     *
     * @return El número móvil de la persona.
     */
    public int getMóvil() {
        return móvil;
    }
}

