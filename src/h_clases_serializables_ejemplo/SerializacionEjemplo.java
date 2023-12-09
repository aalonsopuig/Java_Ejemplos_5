package h_clases_serializables_ejemplo;

/*
 * Ejemplo de serialización de un objeto Persona.
 * Explicación:
 * - Implementación de Serializable: La clase Persona implementa la interfaz Serializable, lo que permite 
 *   que sus instancias sean convertidas a un flujo de bytes y viceversa.
 * - Campo serialVersionUID: Es un identificador único que se utiliza durante la deserialización para 
 *   verificar que el remitente y el receptor de un objeto serializado mantienen la compatibilidad.
 * - Serialización: En el método main, creamos una instancia de Persona y usamos ObjectOutputStream para 
 *   escribir este objeto en un archivo (persona.ser).
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacionEjemplo {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            oos.writeObject(persona);
            System.out.println("Objeto Persona serializado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
