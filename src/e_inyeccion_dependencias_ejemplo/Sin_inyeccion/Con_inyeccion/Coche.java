package e_inyeccion_dependencias_ejemplo.Sin_inyeccion.Con_inyeccion;

/**
 * Clase Coche, que representa un coche.
 * Este coche recibe su motor como una inyección de dependencia, lo que lo hace menos dependiente de una implementación específica de Motor.
 */
class Coche {
    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor; // Inyección de dependencia
    }

    public Motor getMotor() {
        return motor;
    }
}
