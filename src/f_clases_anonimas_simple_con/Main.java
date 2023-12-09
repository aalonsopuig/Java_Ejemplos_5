package f_clases_anonimas_simple_con;

/* 
   Ejemplo simple con una interfaz Boton y luego usar una clase anónima 
   para implementar su comportamiento de manera única. 
   
   Explicación:
    - Interfaz Boton: Esta interfaz define un método presionar. 
      Podría ser cualquier acción como clickear un botón, mover un objeto, etc.

    - Clase Anónima en Main: Dentro del método main, creamos una instancia de 
      Boton con una clase anónima. Esto significa que estamos proporcionando 
      una implementación directa y única para el método presionar sin crear 
      una clase concreta que implemente la interfaz Boton.

    - Uso de boton.presionar(): Cuando llamamos a presionar en la instancia boton, 
      ejecutamos el código definido en nuestra clase anónima, que en este caso es 
      imprimir "La luz se enciende.".
*/

public class Main {
    public static void main(String[] args) {
        /**
         * Creamos una instancia de Boton usando una clase anónima.
         * Aquí definimos el comportamiento del método presionar al vuelo.
         */
        Boton boton = new Boton() {
            @Override
            public void presionar() {
                System.out.println("La luz se enciende.");
            }
        };

        // Usamos el botón con su comportamiento único.
        boton.presionar();
    }
}
