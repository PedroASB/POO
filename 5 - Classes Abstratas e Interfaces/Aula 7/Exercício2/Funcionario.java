package Exercício2;

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
