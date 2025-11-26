package model;

public class Sms extends Notificacao {

	public Sms(String mensagem, String destinatario) {
		super(mensagem, destinatario);
	}
	
	@Override
	public void enviar() {
		System.out.println("Enviando SMS para " + getDestinatario() + ": " + getMensagem());
	}
}
