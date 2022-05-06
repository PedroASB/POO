public class Empregado {
	private String nome;
	private int matricula;
	private Empresa empresa;

	public Empregado(String nome, int matricula, Empresa empresa){
		this.nome = nome;
		this.matricula = matricula;
		this.empresa = empresa;
	}

	public String toString() {
		return "Nome: " + nome + "\nMatricula: " + matricula +
				"\n| Dados da empresa |\n" + empresa;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
