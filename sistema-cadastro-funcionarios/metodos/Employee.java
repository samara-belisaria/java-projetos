package metodos;

public class Employee {
	private String nome;
	private double salarioBruto; 
	private double desconto;
	
	
	// Construtor completo
	public Employee(String nome, double salarioBruto, double desconto) {
		// aqui dentro entram as minhas validações
		if (salarioBruto <= 0) { 
	        throw new IllegalArgumentException("O salário deve ser positivo!"); // exemplo: se o salario for menor ou igual a zero → lance uma exceção
	    }
	    if (desconto < 0 || desconto > salarioBruto) {
	        throw new IllegalArgumentException("Desconto inválido!");  // exemplo: se o desconto for maior que o salário → lance outra exceção
	    }
		
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.desconto = desconto;
	}
	
	
	// Construtor sobrecarregado (sem desconto)
	public Employee(String nome, double salarioBruto) {
		this.nome = nome; 
		this.salarioBruto = salarioBruto;
		this.desconto = 0;
	}
	 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	
	public double calcularSalarioLiquido() {
		return salarioBruto - desconto;
	}
	
	
	public void exibirDados() {
		System.out.printf("Nome: %s | Salário Líquido: R$ %.2f%n", nome, calcularSalarioLiquido());
	}
}
