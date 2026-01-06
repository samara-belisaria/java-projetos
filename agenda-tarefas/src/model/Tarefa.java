package model;

public class Tarefa {
	
	private String descricao;
	
	public Tarefa(String descricao) {
		if(descricao == null || descricao.trim().isEmpty()) {
			throw new IllegalArgumentException("Erro: Descrição inválida! A decrição não pode estar vazia.");
		}
		
		this.descricao = descricao.trim();
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.trim().isEmpty()) {
			throw new IllegalArgumentException("Erro: Descrição inválida! A decrição não pode estar vazia.");
		}
		
		this.descricao = descricao.trim();
	}

}
