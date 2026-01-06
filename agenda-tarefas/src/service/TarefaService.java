package service;

import java.util.ArrayList;
import model.Tarefa;

public class TarefaService {
	
	ArrayList<Tarefa> tarefas;
	
	public TarefaService() {
		tarefas = new ArrayList<>();
	}
	
	public void adicionar(String descricao) {
		Tarefa tarefa = new Tarefa(descricao); // o model valida e dá trim
		tarefas.add(tarefa);
	}
	
	public void listar() {
		if(tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa cadastrada.");
			return;
		}
		
		for(int i = 0; i < tarefas.size(); i++) {
			System.out.println(i + " - " + tarefas.get(i).getDescricao());
		}
	}
	
	public int buscar(String descricao) {
        if (descricao == null) return -1;

        String busca = descricao.trim();
        if (busca.isEmpty()) return -1;

        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getDescricao().equalsIgnoreCase(busca)) {
                return i;
            }
        }

        return -1;
    }
	
	public boolean remover(String descricao) {
		int index = buscar(descricao);
		
		if(index != -1) {
			tarefas.remove(index);
			return true;
		}
		
		return false;
	}
	
	public boolean atualizar(String descricaoAntiga, String descricaoNova) {
		int index = buscar(descricaoAntiga);
	    if(index != -1) {
	        tarefas.get(index).setDescricao(descricaoNova); // o model valida e dá trim
	        return true;
	    }
	    return false;
	}
}
