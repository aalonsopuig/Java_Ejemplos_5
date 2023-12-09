package f_clases_anonimas_simple_sin;
/*
 * Ejemplo equivalente a "f_clases_anonimas_simple_con", pero sin aplicar clases anónimas.
 * Para crear un código equivalente sin usar clases anónimas, necesitaríamos definir una 
 * clase concreta que implemente la interfaz Boton. Este enfoque es más tradicional y se 
 * utiliza cuando esperamos reutilizar la implementación de la interfaz en varias partes 
 * del código o cuando la implementación es demasiado compleja para una clase anónima.
 * 
 * Explicación:
 * - Interfaz Boton: La interfaz sigue siendo la misma, definiendo un contrato para el 
 *   método presionar.
 * - Clase BotonLuz: En lugar de usar una clase anónima, hemos creado una clase concreta 
 *   BotonLuz que implementa la interfaz Boton. Esta clase define el comportamiento 
 *   específico del método presionar.
 * - Uso en Main: En el método main, creamos una instancia de BotonLuz y la utilizamos. 
 *   Esta instancia ejecutará el comportamiento definido en la clase BotonLuz cuando se 
 *   llame al método presionar.
 */

public class Main {
    public static void main(String[] args) {
        // Creación de una instancia de BotonLuz
        Boton boton = new BotonLuz();

        // Usamos el botón con su comportamiento definido en la clase BotonLuz.
        boton.presionar();
    }
}
