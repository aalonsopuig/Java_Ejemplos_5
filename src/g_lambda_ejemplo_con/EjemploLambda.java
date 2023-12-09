package g_lambda_ejemplo_con;

/*
 * Ejemplo básico de uso de expresionaes lambda donde utilizamos una expresión lambda 
 * para filtrar números pares de una lista.
 * 
 * Explicación:
 * - Lista de Números: Creamos una lista de números enteros para demostrar el uso de 
 *   las expresiones lambda.
 * - Filtrado con Lambda: Utilizamos la expresión lambda (n -> n % 2 == 0) dentro del 
 *   método filter de la API Stream. Esta lambda implementa la interfaz funcional 
 *   Predicate<Integer>, que toma un entero n y devuelve true si n es par.
 * - Cadena de Métodos de Stream: stream().filter(...).collect(Collectors.toList()) 
 *   es una secuencia de operaciones de Stream API. stream() convierte la lista en un 
 *   flujo, filter aplica el filtro lambda, y collect(Collectors.toList()) convierte 
 *   el flujo filtrado de nuevo en una lista.
 * - Impresión de Resultados: Finalmente, imprimimos la lista de números pares resultante.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploLambda {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /**
         * Usamos una expresión lambda para filtrar números pares.
         * La expresión (n -> n % 2 == 0) es una lambda que implementa la interfaz Predicate.
         */
        List<Integer> numerosPares = numeros.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());

        // Imprimimos los números pares
        System.out.println("Números pares: " + numerosPares);
    }
}
