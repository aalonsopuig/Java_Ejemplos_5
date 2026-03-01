package l_estudiantes;

// Subclase EstudiantePosgrado
/**
 * Representa un estudiante de posgrado.
 */
public class EstudiantePosgrado extends Estudiante {
    public EstudiantePosgrado(String nombre, int edad, String matricula) {
        super(nombre, edad, matricula);
    }

    @Override
    public String getDetalles() {
        return "Posgrado: " + nombre + ", Edad: " + edad + ", Matrícula: " + matricula;
    }
}