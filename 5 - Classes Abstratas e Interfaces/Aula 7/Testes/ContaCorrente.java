package Testes;

public class ContaCorrente extends Conta implements Tributavel {
	private double limite;

	public boolean validaConta() {
		return (numero > 100000);
	}

	@Override
	public double calculaTributos() {
		return saldo * 0.1;
	}
}
