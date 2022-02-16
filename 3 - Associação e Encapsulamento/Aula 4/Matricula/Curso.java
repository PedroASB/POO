package Matricula;

import java.util.ArrayList;

public class Curso {
	private String nome;
	private String sigla;
	private Departamento departamento;
	private ArrayList<Aluno> alunos = new ArrayList<>();

	// Constructor
	public Curso(){
		this.departamento = new Departamento();
	}

	// Printer
	public void print(){
		System.out.println("Nome do curso: " + nome);
		System.out.println("Sigla do curso: " + sigla);
		System.out.println(this.departamento);
	}

	public void removeAluno(int matricula){
		// ...
	}

	public void removeAluno(Aluno aluno){
		removeAluno(aluno.getMatricula());
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public Aluno getAluno(int matricula){
		//
	}

	public ArrayList<Aluno> getAlunos() {
		//
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
