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

import java.io.Serializable;

/**
 * Clase Motocicleta que implementa Serializable para permitir su serialización.
 * Representa una motocicleta con marca, modelo y cilindrada.
 */
class Motocicleta implements Serializable {
    private static final long serialVersionUID = 1L;
    private String marca;
    private String modelo;
    private int cilindrada;

    /**
     * Constructor para crear una instancia de Motocicleta.
     *
     * @param marca La marca de la motocicleta.
     * @param modelo El modelo de la motocicleta.
     * @param cilindrada La cilindrada de la motocicleta.
     */
    public Motocicleta(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    // Métodos getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getCilindrada() { return cilindrada; }

    @Override
    public String toString() {
        return "Motocicleta{" +
               "marca='" + marca + '\'' +
               ", modelo='" + modelo + '\'' +
               ", cilindrada=" + cilindrada +
               '}';
    }
}

