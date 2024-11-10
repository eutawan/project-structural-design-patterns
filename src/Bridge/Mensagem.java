package Bridge;

public abstract class Mensagem {
    PlataformaEnvio plataformaEnvio;

    public Mensagem(PlataformaEnvio plataformaEnvio) {
        this.plataformaEnvio = plataformaEnvio;
    }

    public abstract void enviar(String conteudo);
}
