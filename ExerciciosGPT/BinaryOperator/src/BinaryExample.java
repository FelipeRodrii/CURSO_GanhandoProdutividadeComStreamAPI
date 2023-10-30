import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {

    BinaryOperator<Integer> soma = (a,b) -> a+b;
    BinaryOperator<Integer> somaUsuario = (a,b) -> 4+5;
    BinaryOperator<Double> diametroCirculo = (r,PI) -> (r*r)*3.14;


    System.out.println(soma.apply(5, 8));
    System.out.println(somaUsuario.apply(null, null));
    System.out.println(diametroCirculo.apply(8.0, null));
    }
}
