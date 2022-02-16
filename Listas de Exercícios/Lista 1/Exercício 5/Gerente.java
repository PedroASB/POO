public class Gerente extends Funcionario {
	/* Atributos */
	private double bonificacao;
	private String tipo;

	/* Métodos */

	// Construtores
	public Gerente(){
	}

	public Gerente(String nome, String telefone, String matricula,
				   double salario, double bonificacao, String tipo){
		super(nome, telefone, matricula, salario);
		setBonificacao(bonificacao);
		setTipo(tipo);
	}

	// Getters
	public double getBonificacao() {
		return bonificacao;
	}

	public String getTipo() {
		return tipo;
	}

	// Setters
	public void setBonificacao(double bonificacao) {
		if (bonificacao >= 0)
			this.bonificacao = bonificacao;
	}

	public void setTipo(String tipo) {
		if (tipo.equals("PF") || tipo.equals("PJ"))
			this.tipo = tipo;
	}

	// Outros métodos
	@Override
	public double recebimentoAnual(){
		return (getSalario() + bonificacao) * 12;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | Telefone: " + telefone +
				" | Matricula: " + matricula + " | Salario: " +
				getSalario() + " | Bonificacao: " + bonificacao +
				" | Tipo: " + tipo;
	}
}
