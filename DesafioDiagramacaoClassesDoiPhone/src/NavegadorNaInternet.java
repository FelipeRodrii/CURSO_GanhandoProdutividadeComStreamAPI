public interface NavegadorNaInternet {

    public default void exibirPagina(){
        System.out.println("Exibindo Página Web");
    }

    public default void adicionarNovaAba(){
        System.out.println("Adicionando Nova aba");
    }

    public default void atualizarPagina(){
        System.out.println("Atualizando Página Web");
    }
    
}
