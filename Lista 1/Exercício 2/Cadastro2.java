import java.util.Scanner;

public class Cadastro2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int qtd;
		char gluten;

		System.out.print("Quantos cereais serao cadastrados? ");
		qtd = input.nextInt();

		if (qtd < 1) {
			System.out.println("Quantidade invalida");
			System.exit(1);
		}

		Cereal[] cereal = new Cereal[qtd];

		for (int i = 0; i < qtd; i++){
			cereal[i] = new Cereal();
		}

		for (int i = 0; i < qtd; i++){
			System.out.println("\n| CADASTRO DE CEREAL |");

			System.out.print("Nome do cereal: ");
			cereal[i].setName(input.next());

			System.out.print("Lista de minerais: ");
			cereal[i].setMinerals(input.next());

			System.out.print("Contem gluten? [S/N] ");
			gluten = input.next().charAt(0);
			if (gluten == 'S' || gluten == 's') cereal[i].setGluten(true);
			else if (gluten == 'N' || gluten == 'n') cereal[i].setGluten(false);

			System.out.print("Teor de fibras: ");
			cereal[i].setFiberContent(input.nextDouble());

			System.out.println("\nCadastrado realizado com sucesso");
		}

		for (int i = 0; i < qtd; i++){
			System.out.printf("\n| CEREAL %d |\n", i + 1);
			System.out.println(cereal[i]);
		}

		input.close();
	}
}
