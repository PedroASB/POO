package Conta;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String titular){
		super(titular);
	}

	void atualizarSaldo(double p){
		depositar(saldo * p);
	}

}
