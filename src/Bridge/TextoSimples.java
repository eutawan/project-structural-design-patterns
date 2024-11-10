package Bridge;

public class TextoSimples extends Mensagem{

    public TextoSimples(PlataformaEnvio plataformaEnvio) {
        super(plataformaEnvio);
    }

    @Override
    public void enviar(String conteudo) {
        System.out.println("Texto simples: ");
        plataformaEnvio.enviarMensagem(conteudo);
    }
}
