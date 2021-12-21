public class Media {
	public static void main(String[] args){
		/*
		VERSÃO ALTERNATIVA
		Aluno aluno1 = new Aluno("Natan", 4567, 7, 8, 9);
		Aluno aluno2 = new Aluno("Julian", 1407, 8, 5, 10);
		Aluno aluno3 = new Aluno("Lucy", 9512, 9, 6, 7);

		double mediaTurma = (aluno1.media() + aluno2.media()
							+ aluno3.media()) / 3.0;

		System.out.printf("Aluno(a) %s | Media %.2f\n", aluno1, aluno1.media());
		System.out.printf("Aluno(a) %s | Media %.2f\n", aluno2, aluno2.media());
		System.out.printf("Aluno(a) %s | Media %.2f\n", aluno3, aluno3.media());
		System.out.printf("Media da turma: %.2f\n", mediaTurma);
		*/

		Aluno[] alunos = new Aluno[3];
		double mediaTurma = 0;
		double maiorNota1 = 0;

		alunos[0] = new Aluno("Natan", 4567, 7, 8, 9);
		alunos[1] = new Aluno("Julian", 1407, 8, 5, 10);
		alunos[2] = new Aluno("Lucy", 9512, 9, 6, 7);

		for (int i = 0; i < 3; i++){
			if (i == 0)
				maiorNota1 = alunos[i].nota(1);
			else if (alunos[i].nota(1) > maiorNota1)
				maiorNota1 = alunos[i].nota(1);
			mediaTurma += alunos[i].media();
			System.out.printf("Aluno(a) %s | Media %.2f\n",
					alunos[i], alunos[i].media());
		}
		mediaTurma /= 3;

		System.out.printf("Media da turma: %.2f\n", mediaTurma);
		System.out.printf("Maior nota 1: %.2f\n", maiorNota1);
	}
}
