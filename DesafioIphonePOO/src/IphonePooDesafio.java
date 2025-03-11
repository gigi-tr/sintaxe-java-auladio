import multifunctionalDevice.AparelhoTelefonico;
import multifunctionalDevice.NavegadorInternet;
import multifunctionalDevice.ReprodutorMusical;

public class IPhonePooDesafio implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void realizarChamada(String numero) {
        System.out.println("Realizando chamada para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando a página...");
    }
}
