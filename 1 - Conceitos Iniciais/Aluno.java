public class Aluno {
	private String nome;
	private int matricula;
	private double nota1, nota2, nota3;

	public Aluno(String nome, int matricula, double nota1,
				 double nota2, double nota3){
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double media(){
		return (nota1 + nota2 + nota3) / 3.0;
	}

	public String toString(){
		return nome + " (mat: " + matricula + ")";
	}

	public double nota(int indice){
		return switch (indice) {
			case 1 -> nota1;
			case 2 -> nota2;
			case 3 -> nota3;
			default -> 0;
		};
	}

}
