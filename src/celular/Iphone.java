package celular;

import aplicativo.AparelhoTelefone;
import aplicativo.NavegadorInternet;
import aplicativo.ReprodutorMusical;

public class Iphone implements AparelhoTelefone, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando a página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

}
