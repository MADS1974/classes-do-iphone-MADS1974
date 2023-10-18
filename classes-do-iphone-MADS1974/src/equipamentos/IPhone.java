package equipamentos;

import objetos.Musica;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private float versao;

    public IPhone() {
    }

    public IPhone(float versao) {
        this.versao = versao;
    }

    @Override
    public void ligar() {
        System.out.println("Aparelho Telefônico: Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho Telefônico: Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Aparelho Telefônico: Iniciar correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegador na Internet: Exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador na Internet: Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador na Internet: Atualizar Página");
    }

    @Override
    public void tocar() {
        System.out.println("Reprodutor Musical: Tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor Musical: Pausar");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Reprodutor Musical: Selecionar música - nome = '" + musica.getNome() + "', Artista = '" + musica.getArtista() + "'");
    }

    public float getVersao() {
        return versao;
    }

    @Override
    public String toString() {
        return "Reprodutor Musical: \nTocar, Pausar, SelecionarMusica\nAparelho Telefônico: \nLigar, Atender, Iniciar correio de voz\nNavegador na Internet: \nExibir página, Adicionar nova aba, Atualizar página";
    }
}

