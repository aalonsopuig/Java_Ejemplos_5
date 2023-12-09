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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Clase para serializar objetos Motocicleta.
 */
public class SerializadorMotocicleta {
    public static void main(String[] args) {
        // Creando una instancia de Motocicleta
        Motocicleta moto = new Motocicleta("Yamaha", "YZF-R1", 1000);

        // Intento de serialización de la instancia de Motocicleta
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("motocicleta.ser"))) {
            oos.writeObject(moto);
            System.out.println("Motocicleta serializada con éxito: " + moto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

