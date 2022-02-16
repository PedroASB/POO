package Matricula;

public class Departamento {
	private String nome;
	private String sigla;

	// toString
	public String toString() {
		return "Nome do departamento: " + nome +
				"\nSigla do departamento: " + sigla;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
