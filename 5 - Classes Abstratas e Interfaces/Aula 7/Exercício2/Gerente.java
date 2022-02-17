package Exercício2;

import java.util.UUID;

public class Gerente extends Funcionario implements Archivable {
	private UUID id;
	private double bonusMensal;

	public Gerente(){
		this.id = UUID.randomUUID();
	}

	public Gerente(String nome, String cpf, String telefone,
				   Endereco endereco, String matricula,
				   double salario, double bonusMensal){
		super(nome, cpf, telefone, endereco, matricula, salario);
		this.id = UUID.randomUUID();
		this.bonusMensal = bonusMensal;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
				"\nCPF: " + cpf +
				"\nTelefone: " + telefone +
				"\n| Endereco |\n" + endereco +
				"\nMatricula: " + matricula +
				"\nSalario: " + salario +
				"\nBonus mensal: " + bonusMensal;
	}

	// Archivable

	@Override
	public UUID getID(){
		return id;
	};

	@Override
	public Object getClone() {
		Endereco cloneEndereco = new Endereco(endereco.getCidade(), endereco.getBairro(),
				endereco.getRua(), endereco.getCep(), endereco.getNumero());

		Gerente cloneGerente = new Gerente(nome, cpf, telefone,
				cloneEndereco, matricula, salario, bonusMensal);

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
