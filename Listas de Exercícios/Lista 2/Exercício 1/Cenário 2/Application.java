public class Application {
	public static void main(String args[]){
		Departamento inf = new Departamento("Instituto de Informatica", "INF");
		Departamento icb = new Departamento("Instituto de Ciencias Biologicas", "ICB");

		Curso cienciaComputacao = new Curso("Ciencia da Computacao", "CC", inf);
		Curso engenhariaSoftware = new Curso("Engenharia de Software", "ES", inf);
		Curso cienciasBiologicas = new Curso("Ciencias Biologicas Bacharelado", "CBB", icb);
		Curso biomedicina = new Curso("Biomedicina", "BM", icb);

		Aluno aluno1 = new Aluno("Carlos", 854623641, 2016, cienciaComputacao);
		Aluno aluno2 = new Aluno("Eduardo", 897145320, 2019, engenhariaSoftware);
		Aluno aluno4 = new Aluno("Lucas", 814569834, 2021, cienciasBiologicas);
		Aluno aluno3 = new Aluno("Beatriz", 801478952, 2018, biomedicina);

		System.out.println("-- Aluno 1 --");
		System.out.println(aluno1);
		System.out.println("\n-- Aluno 2 --");
		System.out.println(aluno2);
		System.out.println("\n-- Aluno 3 --");
		System.out.println(aluno3);
		System.out.println("\n-- Aluno 4 --");
		System.out.println(aluno4);

	}
}
