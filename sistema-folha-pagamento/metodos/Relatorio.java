package metodos;

public class Relatorio {
	public static void exibirResumo(String name, double salarioBruto, double salarioLiquido) {
		System.out.println("Funcionário(a): " + name);
		System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
		System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
		System.out.println("Desconto aplicado: 10%");
	}
}
