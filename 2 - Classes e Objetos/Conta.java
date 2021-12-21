class Conta {
	int numero;
	String nome, tipo;
	double saldo, limite;

	// Método construtor (sem parâmetro)
	Conta(){
		limite = 1000.0;
	}

	// Método construtor (com parâmetro)
	Conta(String tipoPessoa, double limite){
		// O "this" faz referência para os próprios atributos da classe
		if (tipoPessoa.equals("VIP")) this.limite = limite * 2;
		else this.limite = limite;
	}

	boolean sacar(double valor){
		if (valor > limite) return false;
		saldo -= valor;
		return true;
	}

	void depositar(double valor){
		saldo += valor;
	}

	boolean transferir(double valor, Conta destino){
		if (valor > limite) return false;
		saldo -= valor;
		destino.saldo += valor;
		return true;
	}

}