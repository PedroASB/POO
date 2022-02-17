package Exercício3;

import java.util.UUID;

public class Gerente extends Funcionario implements Archivable {
	private UUID id;
	private double bonusMensal;

	public Gerente() {
		this.id = UUID.randomUUID();
	}

	public Gerente(String nome, String cpf, String telefone,
				   Endereco endereco, String matricula,
				   double salario, double bonusMensal) {
		super(nome, cpf, telefone, endereco, matricula, salario);
		this.id = UUID.randomUUID();
		this.bonusMensal = bonusMensal;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
				"\nID: " + id +
				"\nCPF: " + cpf +
				"\nTelefone: " + telefone +
				"\n| Endereco |\n" + endereco +
				"\nMatricula: " + matricula +
				"\nSalario: " + salario +
				"\nBonus mensal: " + bonusMensal;
	}

	@Override
	public UUID getID(){
		return id;
	};

	@Override
	public Object getClone() {
		Gerente cloneGerente = new Gerente(nome, cpf, telefone,
				(Endereco) endereco.getClone(), matricula, salario, bonusMensal);

		// o "clone" gera um ID novo, mas ele deve ser o mesmo do gerente
		cloneGerente.id = this.id;

		return cloneGerente;
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
