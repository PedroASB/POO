package Exercício1;

public class Gerente extends Funcionario {
	private double bonusMensal;

	public Gerente(){}

	public Gerente(String nome, String cpf, String telefone,
				   Endereco endereco, String matricula,
				   double salario, double bonusMensal){
		super(nome, cpf, telefone, endereco, matricula, salario);
		this.bonusMensal = bonusMensal;
	}

	@Override
	public String toString() {
		return "Nome = " + nome +
				"\nCPF: " + cpf +
				"\nTelefone: " + telefone +
				"\nEndereco" + endereco +
				"\nMatricula: " + matricula +
				"\nSalario: " + salario +
				"\nBonus mensal: " + bonusMensal;
	}

	// Getters

	public double getBonusMensal() {
		return bonusMensal; // OBSERVAÇÃO
	}

	// Setters

	public void setBonusMensal(double bonusMensal) {
		this.bonusMensal = bonusMensal;
	}
}
