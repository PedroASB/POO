public class Pessoa {
	private String nome;
	private String nacionalidade;

	String getNome(){
		return nome;
	}

	String getNacionalidade(){
		return nacionalidade;
	}

	void setNome(String nome){
		this.nome = nome;
	}

	void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}

	// Conferir tipo de acesso
	protected Pessoa(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

}