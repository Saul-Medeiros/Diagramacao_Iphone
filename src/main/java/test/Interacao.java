package main.java.test;

import main.java.model.Iphone;
import main.java.model.Modelo;

public class Interacao {
    public static void main(String[] args) {
        Iphone iphone3s = new Iphone(Modelo.IPHONE3s);

        // mostrar o modelo e informações do iphone
        System.out.println("Modelo: " + iphone3s.getModelo());
        System.out.println("Cor: " + iphone3s.getModelo().getCor());
        System.out.println("Memória RAM: " + iphone3s.getModelo().getRam());
        System.out.println("Armazenamento: " + iphone3s.getModelo().getRom());

        // interagindo com as funcionalidades básicas do iphone
        iphone3s.ligar();
        iphone3s.enviarMensagem();
        iphone3s.lerMensagemRecebida();
        iphone3s.realizarChamada();
        iphone3s.encerrarLigacao();
        
        // interagindo com o reprodutor de música
        iphone3s.procurarMusica();
        iphone3s.tocarMusica();
        iphone3s.pausarMusica();
        
        // interagindo com o navegador
        iphone3s.pesquisar();
        iphone3s.abrirNovaGuia();
        iphone3s.fecharTodasGuias();

        // encerrando interação
        iphone3s.desligar();
    }
}
