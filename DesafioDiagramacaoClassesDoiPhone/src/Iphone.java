public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{
    public static void main(String[] args) throws Exception {
        Iphone iPhone = new Iphone();

        System.out.println("Métodos: AparelhoTelefônico");
        iPhone.atender();
        iPhone.ligar();
        iPhone.iniciarCorrerioVoz();

        System.out.println("\nMétodos: NavegadorNaInternet");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.exibirPagina();

        System.out.println("\nMétodos: ReprodutorMusical");
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.tocar();

        
    }
}
