package main.java.model;

public final class Iphone extends AparelhoTelefonico implements Navegador, ReprodutorMusical {

    private Modelo modelo;

    public Iphone (Modelo modelo) {
        this.modelo = modelo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void procurarMusica() {
        System.out.println("Procurando música");
    }

    @Override
    public void pesquisar() {
        System.out.println("Pesquisando informação no navegador");
    }

    @Override
    public void abrirNovaGuia() {
        System.out.println("Abrindo nova guia");
    }

    @Override
    public void fecharTodasGuias() {
        System.out.println("Fechando todas as guias");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Iphone...");
    }
    
    @Override
    public void desligar() {
        System.out.println("Desligando Iphone...");
    }

    @Override
    public void realizarChamada() {
        System.out.println("Realizando Chamada...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Desligando chamada");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem...");
    }

    @Override
    public void lerMensagemRecebida() {
        System.out.println("Lendo mensagem recebida");
    }
}
