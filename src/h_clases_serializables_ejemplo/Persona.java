package h_clases_serializables_ejemplo;

import java.io.Serializable;

/**
 * Clase Persona que implementa la interfaz Serializable.
 * Esto permite que objetos de Persona se puedan serializar.
 */
class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getters y setters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}
