package method;

public class Tarefa {
	
	private String titulo;
	private String descricao;
	private boolean concluida = false;
	
	public Tarefa(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean isConcluida() {
		return this.concluida;
	}
	
	public void concluir() {
		this.concluida = true;
	}
	
	public void exibir() {
		System.out.println("Título: " + titulo);
		System.out.println("Descrição: " + descricao);
		String status = concluida ? "Concluída" : "Não concluída";
		System.out.println("Status: " + status);
	}

}

