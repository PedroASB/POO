package Matricula;

public class Application {
	public static void main(String[] args){
		Aluno aluno1 = new Aluno("Aluneiro");

		aluno1.setMatricula(40028922);
		aluno1.setAno(2017);
		aluno1.getCurso().setNome("Cursozada");
		aluno1.getCurso().setSigla("CZD");
		aluno1.getCurso().getDepartamento().setNome("Departy");
		aluno1.getCurso().getDepartamento().setSigla("DPT");

		aluno1.print();
	}
}
