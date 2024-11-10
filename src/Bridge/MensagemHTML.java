package Bridge;

public class MensagemHTML extends Mensagem{

    public MensagemHTML(PlataformaEnvio plataformaEnvio) {
        super(plataformaEnvio);
    }

    @Override
    public void enviar(String conteudo) {
        System.out.println("Mensagem HTML: ");
        plataformaEnvio.enviarMensagem("<html>" + conteudo + "</html");
    }
}
