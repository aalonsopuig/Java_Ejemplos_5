package h_clases_serializables_ejemplo;

/*
 * Ejemplo de serialización de un objeto Persona.
 * Explicación:
 * - Creación de ObjectInputStream: Usamos ObjectInputStream para leer la secuencia de bytes 
 *   del archivo persona.ser.
 * - Deserialización del Objeto: Con el método readObject() de ObjectInputStream, leemos y 
 *   convertimos la secuencia de bytes almacenada en el archivo de nuevo en un objeto de la 
 *   clase Persona. Esta operación requiere un casting explícito.
 * - Manejo de Excepciones: El proceso de deserialización puede lanzar dos tipos de excepciones: 
 *   IOException (si hay problemas de E/S) y ClassNotFoundException (si la clase del objeto 
 *   serializado no se encuentra en el classpath).
 * - Uso del Objeto Deserializado: Una vez deserializado el objeto, puedes usar sus métodos 
 *   como lo harías con cualquier otro objeto. En este ejemplo, estamos imprimiendo los valores 
 *   de los atributos del objeto Persona deserializado.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializacionEjemplo {
    public static void main(String[] args) {
        // Nombre del archivo donde está almacenado el objeto serializado
        String nombreArchivo = "persona.ser";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            // Leyendo el objeto desde el archivo y convirtiéndolo de nuevo en un objeto Persona
            Persona personaDeserializada = (Persona) ois.readObject();

            // Mostrando información del objeto deserializado
            System.out.println("Objeto Persona deserializado con éxito.");
            System.out.println("Nombre: " + personaDeserializada.getNombre());
            System.out.println("Edad: " + personaDeserializada.getEdad());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
