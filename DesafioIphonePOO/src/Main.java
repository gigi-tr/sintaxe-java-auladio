public class Main {
    public static void main(String[] args) {
        // Criando uma instância do IPhone
        IPhone meuIphone = new IPhone();

        // Testando o Reprodutor Musical
        meuIphone.reproduzirMusica();
        meuIphone.pausarMusica();

        // Testando o Aparelho Telefônico
        meuIphone.realizarChamada("123456789");
        meuIphone.receberChamada("987654321");

        // Testando o Navegador na Internet
        meuIphone.abrirPaginaWeb("www.exemplo.com");
        meuIphone.fecharPaginaWeb();
    }
}
