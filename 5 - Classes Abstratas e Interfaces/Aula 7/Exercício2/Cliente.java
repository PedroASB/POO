package Exercício2;

public class Cliente extends Pessoa {
	private double rendaMensal;

	public Cliente(){}

	public Cliente(String nome, String cpf, String telefone,
				   Endereco endereco, double rendaMensal){
		super(nome, cpf, telefone, endereco);
		this.rendaMensal = rendaMensal;
	}

	@Override
	public String toString() {
		return "Nome = " + nome +
				"\nCPF: " + cpf +
				"\nTelefone: " + telefone +
				"\nEndereco" + endereco +
				"Renda media mensal declarada: " + rendaMensal;
	}

	// Getters

	public double getRendaMensal() {
		return rendaMensal;
	}

	// Setters

	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
}
