public class Funcionario extends Pessoa {
	/* Atributos */
	protected String matricula;
	private double salario;

	/* Métodos */

	// Construtores
	public Funcionario(){
	}

	public Funcionario(String nome, String telefone, String matricula, double salario){
		super(nome, telefone);
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
		if (salario > 0)
			this.salario = salario;
	}

	// Outros métodos
	public void aumentarSalario(double percentual){
		salario += salario * percentual;
	}

	public double recebimentoAnual(){
		return salario * 12;
	}

	public String toString() {
		return "Nome: " + nome + " | Telefone: " + telefone +
				" | Matricula: " + matricula + " | Salario: " +
				getSalario();
	}
}
