package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import service.TarefaService;

public class MainTarefa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TarefaService service = new TarefaService();

        int choose = -1;

        try {
            do {
                System.out.println("=== MENU DE TAREFAS ===");
                System.out.println("1 - Adicionar tarefa");
                System.out.println("2 - Listar tarefas");
                System.out.println("3 - Buscar tarefa");
                System.out.println("4 - Remover tarefa");
                System.out.println("5 - Atualizar tarefa");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma das opções: ");

                try {
                    
                    choose = sc.nextInt();
                    sc.nextLine(); // limpar ENTER

                    System.out.println();

                    switch (choose) {
                        case 1:
                            System.out.print("Descrição da tarefa: ");
                            String descricao = sc.nextLine();
                            service.adicionar(descricao);
                            System.out.println("Tarefa adicionada com sucesso!");
                            break;

                        case 2:
                            service.listar();
                            break;

                        case 3:
                            System.out.print("Informe a descrição da tarefa: ");
                            String buscarDescricao = sc.nextLine();
                            int busca = service.buscar(buscarDescricao);

                            if (busca != -1) {
                                System.out.println("Tarefa encontrada no índice: " + busca);
                            } else {
                                System.out.println("Tarefa não encontrada.");
                            }
                            break;

                        case 4:
                            System.out.print("Informe a descrição da tarefa: ");
                            String removerDescricao = sc.nextLine();
                            boolean removido = service.remover(removerDescricao);

                            if (removido) {
                                System.out.println("Tarefa removida com sucesso!");
                            } else {
                                System.out.println("Tarefa não encontrada!");
                            }
                            break;

                        case 5:
                            System.out.print("Informe a antiga descrição da tarefa: ");
                            String descricaoAntiga = sc.nextLine();

                            System.out.print("Informe a nova descrição da tarefa: ");
                            String descricaoNova = sc.nextLine();

                            boolean atualizado = service.atualizar(descricaoAntiga, descricaoNova);

                            if (atualizado) {
                                System.out.println("Tarefa atualizada com sucesso!");
                            } else {
                                System.out.println("Tarefa não encontrada!");
                            }
                            break;

                        case 0:
                            System.out.println("Encerrando o Menu de Tarefas...");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida. Digite um número.");
                    sc.nextLine(); // descarta "abc"
                    System.out.println();
                    continue; // volta pro menu imediatamente
                } catch (IllegalArgumentException e) {
                    // 2) ERRO DE REGRA (descrição vazia, etc.)
                    System.out.println(e.getMessage());
                }

                System.out.println();

            } while (choose != 0);

        } finally {
            sc.close();
        }
    }
}
