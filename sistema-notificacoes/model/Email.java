package model;

public class Email extends Notificacao {
	
	public Email(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }
	
    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL para " + getDestinatario() + ": " + getMensagem());
    }

}
