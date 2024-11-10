package Bridge;

public class EnvioSMS implements PlataformaEnvio{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por SMS: " + mensagem);
    }
}
