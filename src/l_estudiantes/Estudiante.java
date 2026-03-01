package l_estudiantes;

// Clase abstracta Estudiante
/**
 * Clase abstracta que representa un estudiante.
 * Proporciona los atributos y métodos comunes para todos los tipos de estudiantes.
 */
import java.io.Serializable;

public abstract class Estudiante implements Serializable {
    protected String nombre;
    protected int edad;
    protected String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract String getDetalles();
}