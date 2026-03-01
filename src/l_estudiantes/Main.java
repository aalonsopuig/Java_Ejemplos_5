package l_estudiantes;
import java.io.*;

// Clase principal para iniciar la aplicación
/**
 * Clase principal que inicia la aplicación de gestión de estudiantes.
 */
public class Main {
    public static void main(String[] args) {
        Registro registro = Registro.getInstance();
        registro.agregarEstudiante(new EstudianteGrado("Juan", 20, "G12345"));
        registro.agregarEstudiante(new EstudiantePosgrado("Ana", 25, "P67890"));

        // Mostrar estudiantes registrados
        System.out.println("Estudiantes registrados:");
        registro.mostrarEstudiantes();

        // Guardar registro
        try {
            registro.guardarRegistro("registro_estudiantes.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cargar registro
        try {
            registro.cargarRegistro("registro_estudiantes.dat");
            System.out.println("Estudiantes después de cargar:");
            registro.mostrarEstudiantes();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}