package Bridge;

public class EnvioEmail implements PlataformaEnvio{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por Email: " + mensagem);
    }
}
