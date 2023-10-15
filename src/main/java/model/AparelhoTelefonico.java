package main.java.model;

public abstract class AparelhoTelefonico {
    
    
    public AparelhoTelefonico(){}

    public abstract void ligar();
    public abstract void desligar();
    public abstract void realizarChamada();
    public abstract void atenderChamada();
    public abstract void encerrarLigacao();
    public abstract void enviarMensagem();
    public abstract void lerMensagemRecebida();
}