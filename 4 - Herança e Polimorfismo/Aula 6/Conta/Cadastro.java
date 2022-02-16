package Conta;

public class Cadastro {

	// "static" serve para não haver a necessidade de instanciar o objeto "Cadastro"
	private static void printSaldo(Conta c){
		System.out.println("Nome do titular: " + c.getTitular());
		System.out.println("Saldo da conta: " + c.getSaldo());
	}

	public static void main(String[] args){
		ContaPoupanca contaPoupanca = new ContaPoupanca("Paulo");
		ContaCorrente contaCorrente = new ContaCorrente("Carlos");
		ContaSalario contaSalario = new ContaSalario("Sergio");

		contaSalario.depositar(100);
		contaSalario.sacar(10);
		printSaldo(contaSalario);
		System.out.println();
		contaCorrente.depositar(400);
		contaPoupanca.depositar(500);
		System.out.println();
		printSaldo(contaCorrente);
		printSaldo(contaPoupanca);
	}
}
