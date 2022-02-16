package Matricula;

public class Aluno {
	public String nome;
	public int matricula;
	public int ano;
	private Curso curso;

	// Constructor
	public Aluno(){
		this.curso = new Curso();
	}

	public Aluno(String nome){
		this.curso = new Curso();
		this.nome = nome;
	}

	// Printer
	public void print(){
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Ano: " + ano);
		this.curso.print();
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public int getAno() {
		return ano;
	}

	public Curso getCurso() {
		return curso;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
