public class Cadastro {
	public static void main(String[] args){
		Funcionario[] funcionarios = new Funcionario[4];

		funcionarios[0] = new Caixa("Mateus", "7453-1452", "246523109",
									4000, "7:00", "16:00");
		funcionarios[1] = new Caixa("Fernanda", "4547-1463", "245675819",
									4500, "7:00", "16:00");
		funcionarios[2] = new Caixa("Bernardo", "8954-1235", "265134778",
									5800, "8:00", "17:00");
		funcionarios[3] = new Gerente("Tiago", "7453-1452", "287653124",
									7200, 1500, "PJ");

		Caixa caixa1 = (Caixa) funcionarios[0];
		caixa1.setHorarioEntrada("8:00");
		caixa1.setHorarioSaida("17:00");
		caixa1.setTelefone("9146-3785");
		caixa1.setSalario(4500);

		Gerente gerente = (Gerente) funcionarios[3];
		gerente.setTelefone("8145-2647");
		gerente.setSalario(7400);
		gerente.setBonificacao(2000);
		gerente.setTipo("PF");

		for (Funcionario funcionario : funcionarios) {
			funcionario.aumentarSalario(0.10);
		}

		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("\nFUNCIONARIO " + (i + 1));
			System.out.println(funcionarios[i] + " | Recebimento anual: "
					+ funcionarios[i].recebimentoAnual());
		}

		Cliente cliente1 = new Cliente("Carlos", "4852-1923",
										"854.795.338-86", "04/01/1995");
		Cliente cliente2 = new Cliente("Larissa", "3542-3648",
										"850.221.781-09", "25/10/1990");
		Cliente cliente3 = new Cliente("Marcos", "5249-9321",
										"593.870.486-32", "07/12/1985");

		for (int i = 1; i <= 2; i++) {
			System.out.println("\nDesativando o primeiro cliente: (" + i + "a. tentativa)");
			if (cliente1.desativar())
				System.out.println("Operacao realizada com sucesso.");
			else
				System.out.println("Falha na operacao.");
		}

		System.out.println("\nCLIENTE 1");
		System.out.println(cliente1);
		System.out.println("\nCLIENTE 2");
		System.out.println(cliente2);
		System.out.println("\nCLIENTE 3");
		System.out.println(cliente3);
	}

}
