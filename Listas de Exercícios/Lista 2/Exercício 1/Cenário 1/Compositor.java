public class Compositor {
	private String nome;
	private String nacionalidade;

	public Compositor(String nome, String nacionalidade){
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String toString() {
		return "Nome: " + nome +
				"\nNacionalidade: " + nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
