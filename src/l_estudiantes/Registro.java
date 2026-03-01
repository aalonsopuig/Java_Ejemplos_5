package l_estudiantes;

// Clase Registro con implementación Singleton
import java.util.ArrayList;
import java.util.List;
import java.io.*;

/**
 * Clase Singleton que gestiona el registro de estudiantes.
 * Permite agregar, mostrar, guardar y cargar estudiantes.
 */
public class Registro {
    private List<Estudiante> estudiantes;
    private static Registro instance;

    /**
     * Constructor privado para implementar el patrón Singleton.
     */
    private Registro() {
        estudiantes = new ArrayList<>();
    }

    /**
     * Devuelve la única instancia de la clase Registro.
     *
     * @return instancia única de Registro
     */
    public static Registro getInstance() {
        if (instance == null) {
            instance = new Registro();
        }
        return instance;
    }

    /**
     * Agrega un estudiante al registro.
     *
     * @param estudiante el estudiante a agregar
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /**
     * Muestra todos los estudiantes registrados.
     */
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getDetalles());
        }
    }

    /**
     * Guarda el registro de estudiantes en un archivo.
     *
     * @param filename el nombre del archivo donde se guardará el registro
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void guardarRegistro(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(estudiantes);
        }
    }

    /**
     * Carga el registro de estudiantes desde un archivo.
     *
     * @param filename el nombre del archivo desde donde se cargará el registro
     * @throws IOException si ocurre un error de entrada/salida
     * @throws ClassNotFoundException si no se puede encontrar la clase de un objeto serializado
     */
    public void cargarRegistro(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            estudiantes = (List<Estudiante>) ois.readObject();
        }
    }
}