package Bridge;

public class Main {
    public static void main(String[] args) {
        PlataformaEnvio email = new EnvioEmail();
        PlataformaEnvio SMS = new EnvioSMS();

        Mensagem textoEmail = new TextoSimples(email);
        Mensagem textoSMS = new TextoSimples(SMS);
        Mensagem htmlEmail = new MensagemHTML(email);
        Mensagem htmlSMS = new MensagemHTML(SMS);

        textoEmail.enviar("Mensagem de Texto Simples via Email.");
        textoSMS.enviar("Mensagem de Texto Simples via SMS.");
        htmlEmail.enviar("Mensagem em HTML via Email.");
        htmlSMS.enviar("Mensagem em HTML via SMS.");
    }
}
