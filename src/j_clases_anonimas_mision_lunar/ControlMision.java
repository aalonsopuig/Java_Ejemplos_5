package j_clases_anonimas_mision_lunar;

/**
 * Interfaz para definir el control de la misión lunar.
 * Contiene un método para ejecutar una tarea específica.
 */
@FunctionalInterface  //Una interfaz funcional es una interfaz que contiene exactamente un método abstracto.
interface ControlMision {
    void ejecutar(String tarea);
}
