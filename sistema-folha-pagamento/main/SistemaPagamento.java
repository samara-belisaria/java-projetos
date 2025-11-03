package main;

import java.util.Locale;
import java.util.Scanner;
import metodos.Financeiro;
import metodos.Relatorio;

public class SistemaPagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o seu nome: ");
		String name = sc.nextLine();
		
		System.out.println("Digite o valor do seu salário: ");
		double salarioBruto = sc.nextDouble();
		
		double salarioLiquido = Financeiro.calcularSalarioLiquido(salarioBruto);
		Relatorio.exibirResumo(name, salarioBruto, salarioLiquido);
		
		
		sc.close();
	}

}
