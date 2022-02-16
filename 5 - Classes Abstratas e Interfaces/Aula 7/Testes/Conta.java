package Testes;

public abstract class Conta {
	protected int numero;
//	protected Cliente titular;
	protected double saldo;

	public void saca(double valor) {
		saldo = saldo - valor;
	}

	public void deposita(double valor) {
		saldo = saldo + valor;
	}

	public void transfere(double v, Conta c) {
		saca(v);
		c.deposita(v);
	}

	public abstract boolean validaConta();

}
