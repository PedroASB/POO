package Exercício1;

public abstract class Funcionario extends Pessoa {
	protected String matricula;
	protected double salario;

	public Funcionario(){}

	public Funcionario(String nome, String cpf, String telefone,
					   Endereco endereco, String matricula, double salario){
		super(nome, cpf, telefone, endereco);
		this.matricula = matricula;
		setSalario(salario);
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
				"\nCPF: " + cpf +
				"\nTelefone: " + telefone +
				"\n| Endereco |\n" + endereco +
				"\nMatricula: " + matricula +
				"\nSalario: " + salario;
	}

	// Getters

	public String getMatricula() {
		return matricula;
	}

	public double getSalario() {
		return salario;
	}

	// Setters

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
