package h_clases_serializables_ejemplo;

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
