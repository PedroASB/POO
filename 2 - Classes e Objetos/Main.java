import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Curso[] cursos = new Curso[4];

		System.out.println("Nome / Codigo / Instituto / Carga Horaria");

		for (int i = 0; i < 4; i++){
			cursos[i].nome = input.nextLine();
			cursos[i].codigo = input.nextInt();
			cursos[i].instituto = input.nextLine();
			cursos[i].cargaHoraria = input.nextInt();
		}

		for (int i = 0; i < 4; i++){
			System.out.println("Curso " + cursos[i].nome);
			System.out.println("Codigo " + cursos[i].codigo);
			System.out.println("Instituto " + cursos[i].instituto);
			System.out.println("Carga Horaria " + cursos[i].cargaHoraria);
		}

		input.close();
	}
}