package Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(String titular){
		super(titular);
	}

	@Override
	public boolean sacar(double valor) {
		if ((valor + 0.05) > saldo) return false;
		saldo -= valor + 0.05;
		return true;

//		return super.sacar(valor - 0.05);
	}

	@Override
	public void depositar(double valor) {
		saldo += valor - 0.05;

//		super.depositar(valor - 0.05);
	}

}
