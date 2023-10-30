public interface AparelhoTelefonico{

    public default void ligar(){
        System.out.println("Ligando....");
    }

    public default void atender(){
        System.out.println("Atendendo ligação...");
    }

    public default void iniciarCorrerioVoz(){
        System.out.println("Iniciando Corrêio de voz");
    }
    
}
