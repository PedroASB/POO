package Exercício1;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args){
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		ArrayList<Cliente> clientes = new ArrayList<>();

		Endereco enderecoGenerico = new Endereco();
		Cliente cliente1 = new Cliente("Fulano", "123654", "4002-8922",
				enderecoGenerico, 2900.0);
		Cliente cliente2 = new Cliente("Ciclano", "165654", "8922-4002",
				enderecoGenerico, 6400.0);

		pessoas.add(cliente1);
		pessoas.add(cliente2);
		clientes.add(cliente1);
		clientes.add(cliente2);

		Gerente gerente1 = new Gerente("Beltrano", "156165", "4566-7841",
				enderecoGenerico, "46546", 10000.0, 4000.0);
		Vendedor vendedor1 = new Vendedor("Beltrano", "496848", "4156-7971",
				enderecoGenerico, "41426", 8000.0, 0.20);

		pessoas.add(gerente1);
		pessoas.add(vendedor1);
		funcionarios.add(gerente1);
		funcionarios.add(vendedor1);

		for (Pessoa pessoa : pessoas){
			System.out.println("Nome: " + pessoa.getNome() +
					"\nEndereco:\n" + pessoa.getEndereco());
			System.out.println();
		}

		for (Funcionario funcionario : funcionarios){
			System.out.println("Nome: " + funcionario.getNome() +
					"\nSalario: " + funcionario.getSalario());
			System.out.println();
		}

		for (Cliente cliente : clientes){
			System.out.println("Nome: " + cliente.getNome() +
					"\nRenda: " + cliente.getRendaMensal());
			System.out.println();
		}

	}
}
