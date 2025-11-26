package method;

import java.util.ArrayList;

public class ListaTarefas {

	private ArrayList<Tarefa> tarefas;
	
	public ListaTarefas() {
		this.tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(Tarefa t) {
		
		tarefas.add(t);
	}
	
	public void listarTarefas() {
		
		if(tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa cadastrada");
			return;
		}
		
		System.out.println("===== LISTA DE TAREFAS =====");
		for(Tarefa t : tarefas) {
			t.exibir();
			System.out.println();
		}
	}
	
	public Tarefa buscarPorTitulo(String titulo) {
		for(Tarefa t : tarefas) {
			if(t.getTitulo().equalsIgnoreCase(titulo)) {
				return t;
			}
		}
		
		return null;
	}
	
	public boolean concluirTarefa(String titulo) {
		for(Tarefa t : tarefas) {
			if(t.getTitulo().equalsIgnoreCase(titulo)) {
				t.concluir();
				return true;
			}
		}
		
		return false;
	}
	
	public boolean removerTarefa(String titulo) {
	    for (int i = 0; i < tarefas.size(); i++) {
	        Tarefa t = tarefas.get(i);
	        if (t.getTitulo().equalsIgnoreCase(titulo)) {
	            tarefas.remove(i); // remove pelo índice
	            return true;
	        }
	    }
	    return false;
	}
}
