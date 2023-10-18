package interacao;

import equipamentos.IPhone;

public class Testador {
    public static void main(String[] args) {
        IPhone iphone = new IPhone(1.0f);
      
        iphone.tocar();
        System.out.println("pausar");
        System.out.println("selecionar musica: Caneta Azul - artista: Manoel Gomes");

        iphone.ligar();
        System.out.println("atender");
        System.out.println("iniciar Correio de Voz");

        iphone.exibirPagina("https://youtu.be/2P_esm8cNgU");
        System.out.println("adicionar nova aba");
        System.out.println("atualizar pagina");
       
    }
}

