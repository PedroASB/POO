package Musicas;

public class Compositor {
	private String nome;
	private String nacionalidade;

	// Constructors
	public Compositor(){ }

	public Compositor(String nome, String nacionalidade){
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	// toString
	public String toString() {
		return ("Nome: " + nome + "\nNacionalidade: "
				+ nacionalidade);
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
