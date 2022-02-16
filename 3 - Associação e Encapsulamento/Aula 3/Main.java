import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matricula;
		Funcionario auxFuncionario = new Funcionario();
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

//		matrícula, nome, CPF, cargo, salário, departamento e
//		endereço (rua, número, complemento, bairro, cidade e estado)

		while (true){
			System.out.println("| Dados do Funcionario |");
			System.out.print("Matricula: ");
			matricula = input.nextInt();
			if (matricula == 0) break;

			auxFuncionario.setMatricula(matricula);
			System.out.print("Nome: ");
			auxFuncionario.setNome(input.nextLine());
			System.out.print("CPF: ");
			auxFuncionario.setCPF(input.nextLine());
			System.out.print("Cargo: ");
			auxFuncionario.setCargo(input.nextLine());
			System.out.print("Salario: ");
			auxFuncionario.setSalario(input.nextDouble());
			System.out.print("Departamento: ");
			auxFuncionario.setDepartamento(input.nextLine());

			System.out.println("| Dados do Endereco |");

			System.out.print("Rua: ");
			auxFuncionario.endereco.setRua(input.nextLine());
			System.out.print("Numero: ");
			auxFuncionario.endereco.setNumero(input.nextLine());
			System.out.print("Complemento: ");
			auxFuncionario.endereco.setComplemento(input.nextLine());
			System.out.print("Bairro: ");
			auxFuncionario.endereco.setBairro(input.nextLine());
			System.out.print("Cidade: ");
			auxFuncionario.endereco.setCidade(input.nextLine());
			System.out.print("Estado: ");
			auxFuncionario.endereco.setEstado(input.nextLine());

			listaFuncionarios.add(auxFuncionario);
			System.out.println("\nFuncionario adicionado com sucesso!\n");
		}

		for (int i = 0; i < listaFuncionarios.size(); i++){
			auxFuncionario = listaFuncionarios.get(i);
			if (auxFuncionario.getCargo().equals("vendedor")){
				auxFuncionario.setSalario(1.2 * auxFuncionario.getSalario());
			}
			System.out.println("\nFuncionario " + i);
			System.out.println(auxFuncionario);
			System.out.println(auxFuncionario.endereco);
		}

		input.close();
	}
}
