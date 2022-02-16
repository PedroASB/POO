package Conta;

public class Conta {
	private String titular;
	protected double saldo;

	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean sacar(double valor) {
		if (valor > saldo) return false;
		saldo -= valor;
		return true;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean transferir(Conta conta, double valor) {
		if (valor > saldo) return false;
		saldo -= valor;
		conta.saldo += valor;
		return true;

		/*
		Essa versão de "transferir" pode gerar alguns erros, pois os métodos
		podem ser sobrescritos

		if (!sacar(valor)) return false;
		conta.depositar(valor);
		return true;
		 */
	}

}