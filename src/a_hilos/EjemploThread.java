package a_hilos;

/**
 * Esta clase representa un hilo personalizado que extiende la clase {@link Thread}.
 * Cada instancia de esta clase imprime un número en un intervalo regular.
 */
public class EjemploThread extends Thread {
   
   // Número que este hilo imprimirá.
   private int numero;

   /**
    * Constructor que inicializa una instancia de EjemploThread con un número específico.
    *
    * @param n El número que este hilo imprimirá.
    */
   EjemploThread(int n) {
      numero = n;
   }

   /**
    * Método sobreescrito de la clase Thread. 
    * Ejecuta una tarea en bucle que imprime un número cada segundo.
    */
   @Override
   public void run() {
      try { 
         while (true) { // Bucle infinito
            System.out.println(numero); // Imprime el número
            sleep(1000); // Duerme el hilo por 1000 milisegundos (1 segundo)
         }
      } catch (InterruptedException e) {
         // Este bloque catch se ejecuta si el hilo es interrumpido durante el sueño.
         return; // Finaliza el hilo.
      } 
   }

   /**
    * Método principal. Crea y arranca 10 instancias de EjemploThread.
    *
    * @param args No utilizado.
    */
   public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         new EjemploThread(i).start(); // Crea y arranca un nuevo hilo para cada número de 0 a 9.
      }
   }
}


