package e_inyeccion_dependencias_ejemplo_sin;

/* Ejemplo sin inyección. 
*  La clase Coche crea una instancia de Motor directamente 
*  dentro de su constructor. Esto hace que Coche esté fuertemente acoplado a la clase Motor.
*/

// Uso
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println("Tipo de motor: " 
        + coche.getMotor().getTipo());
    }
}
