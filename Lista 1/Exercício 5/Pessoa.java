public class Pessoa {
	/* Atributos */
	protected String nome;
	protected String telefone;

	/* Métodos */

	// Construtores
	public Pessoa(){
	}

	public Pessoa(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
