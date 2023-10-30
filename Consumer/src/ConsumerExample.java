import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args){
        List<Integer> numeros =  Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        // Imprimir numeros Pares
        Consumer<Integer> imprimirNumerosPar = numero -> {
            if(numero %2 ==0){
                System.out.println(numero);
            }
        };

        // Imprimir palavras de Lista


        numeros.stream().forEach(imprimirNumerosPar);
    }
}