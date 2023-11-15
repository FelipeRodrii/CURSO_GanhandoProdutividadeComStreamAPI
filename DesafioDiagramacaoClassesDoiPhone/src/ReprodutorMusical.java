public interface ReprodutorMusical {

    default void tocar(){
        System.out.println("Tocando Musica....");
    }

    default void pausar(){
        System.out.println("Pausando Musica...");
    }

    default void selecionarMusica(){
        System.out.println("Selecionando nova mMusica...");
    }

}
