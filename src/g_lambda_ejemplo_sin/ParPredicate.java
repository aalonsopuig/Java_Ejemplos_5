package g_lambda_ejemplo_sin;

import java.util.function.Predicate;

/**
 * Clase ParPredicate que implementa Predicate<Integer> para determinar si un número es par.
 */
class ParPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
}
