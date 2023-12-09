package g_lambda_ejemplo_sin;

/*
 * Ejemplo comparativo sin expresiones lambda equivalente al ejemplo g_lambda_ejemplo_con
 * donde filtramos números pares de una lista
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploSinLambda {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Instancia de ParPredicate
        ParPredicate esPar = new ParPredicate();

        // Filtramos los números pares usando la instancia de ParPredicate
        List<Integer> numerosPares = numeros.stream()
                                            .filter(esPar)
                                            .collect(Collectors.toList());

        // Imprimimos los números pares
        System.out.println("Números pares: " + numerosPares);
    }
}
