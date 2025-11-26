package exercise;

import java.util.ArrayList;
import java.util.Scanner;

import model.Notificacao;
import model.Email;
import model.Sms;
import model.Push;

public class SistemaNotificacoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Notificacao> lista = new ArrayList<>();
		
		int option;
		
		do {
			
			System.out.println("===== SISTEMA DE NOTIFICAÇÕES =====");
			System.out.println("1 - Cadastrar notificação por EMAIL");
			System.out.println("2 - Cadastrar notificação por SMS");
			System.out.println("3 - Cadastrar notificação por PUSH");
			System.out.println("4 - Enviar todas as notificações");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			option = sc.nextInt();
			System.out.println();
			
			
			if(option == 1) {
				sc.nextLine();
				System.out.print("Digite o EMAIL do destinatário: ");
				String destinatario = sc.nextLine();
				
				System.out.print("Digite a mensagem: ");
				String mensagem = sc.nextLine();
				
				Notificacao n = new Email(mensagem, destinatario);
				lista.add(n);
				System.out.println();
				
				
			} else if(option == 2) {
				sc.nextLine();
				System.out.print("Digite o telefone: ");
				String destinataioS = sc.nextLine();
				
				System.out.print("Digite a mensagem: ");
				String mensagemS = sc.nextLine();
				
				Notificacao n2 = new Sms(mensagemS, destinataioS);
				lista.add(n2);
				System.out.println();
				
				
			} else if(option == 3) {
				sc.nextLine();
				System.out.print("Digite o nome: ");
				String destinatarioP = sc.nextLine();
				
				System.out.println("Digite a mensagem: ");
				String mensagemP = sc.nextLine();
				
				Notificacao n3 = new Push(mensagemP, destinatarioP);
				lista.add(n3);
				System.out.println();
				
				
			} else if(option == 4) {
				if(lista.isEmpty()) {
					System.out.println("Nenhuma notificação cadastrada.");
				} else {
					System.out.println("Enviando todas as notificações...");
					for(Notificacao n : lista) { // for-each
						n.enviar(); // POLIMORFISMO aqui
					}
					
					lista.clear();
				}
			}
			
			
		} while(option != 0);
		
		System.out.println("Saindo do programa...");
		
		
		
		sc.close();

	}

}
