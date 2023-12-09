package i_clases_serializables_motos;

/*
 * Explicación
 * - Clase Motocicleta: Define una motocicleta con atributos como marca, modelo y cilindrada. 
 *   Implementa Serializable para permitir la serialización.
 * - Serialización en SerializadorMotocicleta: Se crea una instancia de Motocicleta y se 
 *   serializa en un archivo motocicleta.ser.
 * - Deserialización en DeserializadorMotocicleta: Se lee el archivo motocicleta.ser y se 
 *   reconstruye el objeto Motocicleta a partir de los datos serializados.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Clase para deserializar objetos Motocicleta.
 */
public class DeserializadorMotocicleta {
    public static void main(String[] args) {
        // Nombre del archivo donde está almacenado el objeto serializado
        String nombreArchivo = "motocicleta.ser";

        // Intento de deserialización del objeto Motocicleta
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            Motocicleta motoDeserializada = (Motocicleta) ois.readObject();
            System.out.println("Motocicleta deserializada con éxito: " + motoDeserializada);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

