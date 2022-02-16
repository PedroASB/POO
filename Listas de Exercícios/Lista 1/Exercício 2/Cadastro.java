import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Cereal cereal = new Cereal();
		char opt, gluten;

		while (true){
			System.out.println("| CADASTRO DE CEREAL |");

			System.out.print("Nome do cereal: ");
			cereal.setName(input.next());

			System.out.print("Lista de minerais: ");
			cereal.setMinerals(input.next());

			System.out.print("Contem gluten? [S/N] ");
			gluten = input.next().charAt(0);
			if (gluten == 'S' || gluten == 's') cereal.setGluten(true);
			else if (gluten == 'N' || gluten == 'n') cereal.setGluten(false);

			System.out.print("Teor de fibras: ");
			cereal.setFiberContent(input.nextDouble());

			System.out.println();
			System.out.println(cereal);

			System.out.print("\nDeseja cadastrar outro cereal? [S/N] ");
			opt = input.next().charAt(0);
			if (opt == 'N' || opt == 'n') break;

			System.out.println();
		}

		input.close();
	}
}
