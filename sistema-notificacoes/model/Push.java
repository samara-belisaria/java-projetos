package model;

public class Push extends Notificacao {
	
	public Push(String mensagem, String destinatario) {
		super(mensagem, destinatario);
	}
	
	@Override
	public void enviar() {
		System.out.println("Enviando PUSH para " + getDestinatario() + ": " + getMensagem());
	}

}
