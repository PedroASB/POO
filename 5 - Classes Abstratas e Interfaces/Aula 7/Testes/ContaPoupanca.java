package Testes;

public class ContaPoupanca extends Conta {
	private double juros;

	public boolean validaConta() {
		return (numero <= 100000);
	}
}
