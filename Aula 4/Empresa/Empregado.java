package Empresa;

public class Empregado {
	public String nome;
	public int matricula;
	private Empresa empresa;

	// Contructors
	public Empregado(){
		this.empresa = new Empresa();
	}

	public Empregado(String nome){
		this.empresa = new Empresa();
		this.nome = nome;
	}

	// Printer
	public void print(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("\n| Empresa |");
		this.empresa.print();
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
