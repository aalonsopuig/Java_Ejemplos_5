package e_inyeccion_dependencias_ejemplo.Sin_inyeccion;

/**
 * Clase Coche, que representa un coche.
 * Este coche crea su propio motor internamente, lo que le hace dependiente de la clase Motor específica.
 */
class Coche {
    private Motor motor;

    public Coche() {
        this.motor = new Motor(); // Creación directa del motor
    }

    public Motor getMotor() {
        return motor;
    }
}
