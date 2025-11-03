package main;

import java.util.Scanner;
import java.util.ArrayList;
import metodos.Employee;

public class Funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Quantos funcionários deseja cadastrar? ");
		int funcionario = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Employee> lista = new ArrayList<>();
		
		for(int i = 1; i <= funcionario; i++) {
			System.out.print("Digite o nome do funcionário: ");
			String nome = sc.nextLine();
			System.out.print("Digite o salário bruto: ");
			double salarioBruto = sc.nextDouble();
			sc.nextLine();
			System.out.print("Digite o desconto: ");
			double desconto = sc.nextDouble();
			sc.nextLine();
			Employee f = new Employee(nome, salarioBruto, desconto);
			lista.add(f);
			System.out.println();
	}
		
		for (Employee e : lista) {
		    e.calcularSalarioLiquido();
		}
		
		
		System.out.println("===== RELATÓRIO FINAL =====");
		
		for (Employee e : lista) {
		    e.exibirDados();
		}
		
		System.out.println("============================");
		
		sc.close();

	}

}
