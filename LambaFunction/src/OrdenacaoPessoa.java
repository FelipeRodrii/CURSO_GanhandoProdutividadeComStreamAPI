import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenarPorAltura(){
        if(!pessoaList.isEmpty()){
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));

            return pessoasPorAltura;
        }else{
            throw new RuntimeException("A lista está vázia");
        }
    }

   
}

/*
 * Funções Lambda podem ser usadas para abreviar uma lista de comandos e outras funções.
 * Sintaxe: (argumento) -> (corpo).
 *  BinaryOperator <Integer> soma = (a,  b) -> a + b; Exemplo de Lambda.
 */


 


