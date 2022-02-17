package Exercício2;

public class Vendedor extends Funcionario {
	private double porcentagemVenda;

	public Vendedor(){}

	public Vendedor(String nome, String cpf, String telefone,
					Endereco endereco, String matricula,
					double salario, double porcentagemVenda){
		super(nome, cpf, telefone, endereco, matricula, salario);
		this.porcentagemVenda = porcentagemVenda;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
				"\nCPF: " + cpf +
				"\nTelefone: " + telefone +
				"\n| Endereco |\n" + endereco +
				"\nMatricula: " + matricula +
				"\nSalario: " + salario +
				"\nPorcentagem de venda: " + porcentagemVenda;
	}

	// Getters

	public double getPorcentagemVenda() {
		return porcentagemVenda;
	}

	// Setters

	public void setPorcentagemVenda(double porcentagemVenda) {
		this.porcentagemVenda = porcentagemVenda;
	}
}
