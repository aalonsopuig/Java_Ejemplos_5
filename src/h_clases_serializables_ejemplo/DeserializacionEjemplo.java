package h_clases_serializables_ejemplo;

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
