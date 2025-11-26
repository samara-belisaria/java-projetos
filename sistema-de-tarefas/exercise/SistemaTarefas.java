package exercise;

import java.util.Scanner;

import method.Tarefa;
import method.ListaTarefas;

public class SistemaTarefas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choose;
		
		ListaTarefas l = new ListaTarefas();
		
		do {
			System.out.println("===== MENU =====");
			System.out.println("1 - Adicionar Tarefa");
			System.out.println("2 - Listar tarefas");
			System.out.println("3 - Buscar tarefa");
			System.out.println("4 - Concluir tarefa");
			System.out.println("5 - Remover Tarefa");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			choose = sc.nextInt();
			System.out.println();
			
			if(choose == 1) {
				sc.nextLine();
				System.out.print("Digite o título da tarefa: ");
				String titulo = sc.nextLine();
				
				System.out.print("Digite a descrição dessa tarefa: ");
				String descricao = sc.nextLine();
				
				Tarefa t = new Tarefa(titulo, descricao);
				l.adicionarTarefa(t);
				System.out.println("Tarefa adicionada!");
				System.out.println();
				
				
			} else if(choose == 2) {
				l.listarTarefas();
				System.out.println();
				
			} else if(choose == 3) {
				System.out.print("Digite o título da tarefa: ");
				sc.nextLine();
				String nomeBusca = sc.nextLine();
				
				Tarefa b = l.buscarPorTitulo(nomeBusca);
				
				if(b == null) {
					System.out.println("Tarefa não encontrada.");
				} else {
					b.exibir();
				}
				
				System.out.println();
				
			} else if(choose == 4) {
				sc.nextLine();
				System.out.print("Digite o título da tarefa: ");
				String nomeT = sc.nextLine();
				
				boolean saida = l.concluirTarefa(nomeT);
				
				if(saida) {
					System.out.println("Tarefa concluída com sucesso!");
				} else {
					System.out.println("Tarefa não encontrada.");
				}
				
				System.out.println();
				
				
			} else if(choose == 5) {
				sc.nextLine();
				System.out.print("Digite o título da tarefa: ");
				String remover = sc.nextLine();
				
				boolean exit = l.removerTarefa(remover);
				
				if(exit) {
					System.out.println("Tarefa removida com sucesso!");
				} else {
					System.out.println("Tarefa não encontrada.");
				}
			}
			 System.out.println();
			
		} while (choose != 0);
		
		System.out.println("Encerrando o programa...");
		
		sc.close();

	}

}
