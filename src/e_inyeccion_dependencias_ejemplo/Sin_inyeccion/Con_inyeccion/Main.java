package e_inyeccion_dependencias_ejemplo.Sin_inyeccion.Con_inyeccion;

/* Ejemplo con inyección.  
 * Coche recibe un objeto Motor a través de su constructor. Esto reduce el 
 * acoplamiento entre Coche y Motor, y hace que el código sea más flexible 
 * y fácil de probar. Además, se utiliza una interfaz Motor, lo que permite 
 * cambiar la implementación del motor sin modificar la clase Coche.
*/

// Uso
public class Main {
    public static void main(String[] args) {
        Motor motor = new MotorEstandar();
        Coche coche = new Coche(motor);
        System.out.println("Tipo de motor: " + coche.getMotor().getTipo());
    }
}
