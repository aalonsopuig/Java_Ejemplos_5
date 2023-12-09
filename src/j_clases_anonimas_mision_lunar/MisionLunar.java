package j_clases_anonimas_mision_lunar;

/*
 * Programa de ejemplo para un ejercicio de clase:
 * 
 * Crear un programa en Java que utilice clases anónimas para simular un sistema de control 
 * en una misión de colonización de la Luna. El sistema controlará diferentes aspectos del 
 * viaje y la colonia lunar, como el mantenimiento de la nave espacial y la gestión de 
 * recursos en la colonia.
 * 
 * Explicación del Código
 * 
 * - Interfaz ControlMision: Una interfaz funcional que define un método ejecutar para 
 *   realizar tareas específicas de la misión lunar.
 * - Clases Anónimas: Se crean dos implementaciones anónimas de ControlMision. La primera, 
 *   controlNave, se enfoca en tareas de control de la nave espacial. La segunda, 
 *   gestionRecursos, se centra en la gestión de recursos en la Luna.
 * - Ejecución de Tareas: Cada implementación anónima se usa para ejecutar tareas relevantes 
 *   a su área, demostrando cómo diferentes funcionalidades pueden ser manejadas por distintas 
 *   instancias de una interfaz.
 */

public class MisionLunar {
    public static void main(String[] args) {
        /**
         * Implementación de la interfaz ControlMision para el control de la nave espacial.
         * Esta clase anónima define cómo se ejecuta una tarea relacionada con la nave.
         */
        ControlMision controlNave = new ControlMision() {
            @Override
            public void ejecutar(String tarea) {
                System.out.println("Controlando la nave para: " + tarea);
            }
        };

        /**
         * Implementación de la interfaz ControlMision para la gestión de recursos en la Luna.
         * Esta clase anónima define cómo se ejecuta una tarea de gestión de recursos.
         */
        ControlMision gestionRecursos = new ControlMision() {
            @Override
            public void ejecutar(String tarea) {
                System.out.println("Gestionando recursos lunares para: " + tarea);
            }
        };

        // Ejecutando tareas específicas con las implementaciones de ControlMision
        controlNave.ejecutar("mantenimiento del motor");
        gestionRecursos.ejecutar("construcción de hábitat");
    }
}
