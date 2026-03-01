package l_estudiantes;

// Subclase EstudianteGrado
/**
 * Representa un estudiante de grado.
 */
public class EstudianteGrado extends Estudiante {
    public EstudianteGrado(String nombre, int edad, String matricula) {
        super(nombre, edad, matricula);
    }

    @Override
    public String getDetalles() {
        return "Grado: " + nombre + ", Edad: " + edad + ", Matrícula: " + matricula;
    }
}
