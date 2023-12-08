package e_inyeccion_dependencias_ejemplo_con;

/**
 * Implementación de la interfaz Motor.
 */
class MotorEstandar implements Motor {
    private String tipo;

    public MotorEstandar() {
        this.tipo = "Motor estándar";
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
