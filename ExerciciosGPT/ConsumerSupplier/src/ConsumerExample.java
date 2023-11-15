import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample{
    public static void main(String[] args) {
        //Declarações dos Consumer's

       Consumer<String> boasVindas = (mensagem) -> System.out.println("Hellor World DEV, Esse é um print feito diretamente com o Consumer, uma Functional Interface");

        Consumer<String> segundaMensagem = (mensagem) -> System.out.println(mensagem);

        //Consumer com mensagem pré definida, só chamarmos o Consumer com um Null de Parâmetro
        boasVindas.accept(null);

        //Consumer, indicando uma variável a ser impressa.
        String mensagem = "Aqui estamos definindo uma var na segunda mensagem";
        segundaMensagem.accept(mensagem);

        //Supplier, não pode receber parâmetros igual o Consumer, ,as podemos obter o mesmo efeito de retorno, pré-definindo ou variáveis valores.
        Supplier<String> nome = () -> "Felipe Rodrigues";
        Supplier<Integer> idade = () -> 24;
        String teste= "Teste";
        Supplier<String> stringTeste = () -> teste;

        System.out.println("Nome do Usuário:"+nome.get()+" Idade do usuário:"+idade.get()+ stringTeste.get().toString());
        
    }
   
}

