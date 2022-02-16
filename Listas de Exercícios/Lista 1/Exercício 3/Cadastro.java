import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Morador> moradores = new ArrayList<>();
		int qtd;

		System.out.print("Informe quantos moradores serao cadastrados: ");
		qtd = input.nextInt();
		input.nextLine();

		if (qtd < 1) {
			System.out.println("Quantidade invalida");
			System.exit(1);
		}

		for (int i = 0; i < qtd; i++){
			Morador auxMorador = new Morador();
			System.out.println("\n| CADASTRO DE MORADOR |");

			System.out.print("Nome: ");
			auxMorador.setNome(input.nextLine());

			System.out.print("CPF: ");
			auxMorador.setCPF(input.nextLine());

			System.out.print("Sexo: [M/F] ");
			char sexo = input.nextLine().charAt(0);
			if (sexo == 'M' || sexo == 'F' || sexo == 'm' || sexo == 'f') {
				auxMorador.setSexo(sexo);
			}

			System.out.print("Data de nascimento: (dd/mm/aaaa) ");
			auxMorador.setDataNascimento(input.nextLine());

			System.out.print("Telefone: ");
			auxMorador.setTelefone(input.nextLine());

			System.out.print("Codigo de acesso: ");
			auxMorador.setCodigoAcesso(input.nextLine());

			moradores.add(auxMorador);
			System.out.println("\nMorador cadastrado com sucesso");
		}

		for (int i = 0; i < qtd; i++){
			System.out.printf("\n| MORADOR %d |\n", i + 1);
			System.out.println(moradores.get(i));
		}

		input.close();
	}
}
