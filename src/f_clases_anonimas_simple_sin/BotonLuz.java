package f_clases_anonimas_simple_sin;

/**
 * Clase BotonLuz que implementa la interfaz Boton.
 * Esta clase define un comportamiento específico para el método presionar.
 */
class BotonLuz implements Boton {
    @Override
    public void presionar() {
        System.out.println("La luz se enciende.");
    }
}
