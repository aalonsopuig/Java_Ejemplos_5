package e_inyeccion_dependencias_ejemplo.Sin_inyeccion;

/**
 * Clase Motor, que representa el motor de un coche.
 */
class Motor {
    private String tipo;

    public Motor() {
        this.tipo = "Motor estándar";
    }

    public String getTipo() {
        return tipo;
    }
}
