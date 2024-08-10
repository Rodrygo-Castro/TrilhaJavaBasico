
import aplicativo.AparelhoTelefone;
import aplicativo.NavegadorInternet;
import aplicativo.ReprodutorMusical;
import celular.Iphone;

public class App {

    public static void main(String[] args) throws Exception {
        // Criação de instâncias de interfaces com referência para a classe concreta
        // Iphone
        ReprodutorMusical ipod;
        AparelhoTelefone telefone;
        NavegadorInternet internet;
        Iphone iphone;

        // Simulação de escolha de aplicativo
        String meuApp = "telefone";

        // Criação de instâncias baseadas na escolha do aplicativo
        switch (meuApp) {
            case "telefone" -> {
                telefone = new Iphone();
                System.out.println("Usando polimorfismo para chamar métodos da interface Telefone");
                telefone.atender();
                telefone.ligar("11 99345-6587");
                telefone.iniciarCorreioVoz();
                System.out.println();
            }
            case "ipod" -> {
                ipod = new Iphone();
                System.out.println("Usando polimorfismo para chamar métodos da interface Ipod");
                ipod.selecionarMusica("coldplay: My Universe");
                ipod.tocar();
                ipod.pausar();
                System.out.println();
            }
            case "internet" -> {
                internet = new Iphone();
                System.out.println("Usando polimorfismo para chamar métodos da interface Navegador");
                internet.exibirPagina("https://github.com/Rodrygo-Castro");
                internet.atualizarPagina();
                internet.adicionarNovaAba();
                System.out.println();
            }
            default -> {
                // Usando a instância direta da classe Iphone
                iphone = new Iphone(); // Inicializa a variável iphone
                System.out.println("iPhone utilizando os métodos da implementação");
                iphone.exibirPagina("https://github.com/Rodrygo-Castro");
                iphone.atualizarPagina();
                System.out.println();
                iphone.ligar("11 99345-6587");
                iphone.iniciarCorreioVoz();
                System.out.println();
                iphone.tocar();
                iphone.pausar();
            }
        }
    }
}
