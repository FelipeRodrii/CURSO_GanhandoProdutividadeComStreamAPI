import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPredicateInterface {

public static void main(String[] args) {

    Function<Integer, String> intToString = (num) -> String.valueOf(num);
    Function<Integer, Integer>  intToSquare = (num) -> num*num;
    Function<String, Integer> stringToInt = (num) -> Integer.valueOf(num);

    System.out.println(intToString.apply(48));
    System.out.println(intToSquare.apply(6));
    System.out.println(stringToInt.apply("27"));


    List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

    Predicate<Integer> isPar = n -> n%2==0;

    FunctionPredicateInterface functionPredicate = new FunctionPredicateInterface();
        List<Integer> numerosPares = functionPredicate.filtrarNumeros(numeros, isPar);
        System.out.println(numerosPares);
    }

    public List<Integer> filtrarNumeros(List<Integer> numeros, Predicate<Integer> condicao) {
        List<Integer> resultado = new ArrayList<>();

        for (Integer numero : numeros) {
            if (condicao.test(numero)) {
                resultado.add(numero);
            }
        }

        return resultado;
    }
}

