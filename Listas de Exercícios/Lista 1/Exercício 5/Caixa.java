public class Caixa extends Funcionario {
	/* Atributos */
	private String horarioEntrada;
	private String horarioSaida;

	/* Métodos */

	// Construtores
	public Caixa(){
	}

	public Caixa(String nome, String telefone, String matricula,
				 double salario, String horarioEntrada, String horarioSaida){
		super(nome, telefone, matricula, salario);
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}

	// Getters
	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public String getHorarioSaida() {
		return horarioSaida;
	}

	// Setters
	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	// Outros métodos
	@Override
	public String toString() {
		return "Nome: " + nome + " | Telefone: " + telefone +
				" | Matricula: " + matricula + " | Salario: " +
				getSalario() + " | Horario de entrada: " +
				horarioEntrada + " | Horario de saida: " +
				horarioSaida;
	}
}
