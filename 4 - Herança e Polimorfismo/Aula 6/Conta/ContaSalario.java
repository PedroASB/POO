package Conta;

public class ContaSalario extends ContaCorrente {

	public ContaSalario(String titular){
		super(titular);
	}

	@Override
	public boolean sacar(double valor) {
		if ((valor + 0.02) > saldo)
			return false;
		saldo -= valor + 0.02;
		return true;

//		return super.sacar(valor - 0.02);
	}

	@Override
	public void depositar(double valor) {
		saldo += valor - 0.02;

//		super.depositar(valor - 0.02);
	}

	@Override
	public boolean transferir(Conta conta, double valor) {
		if (valor > saldo)
			return false;
		saldo -= valor + 0.01;
		conta.saldo += valor;
		return true;
	}

}
