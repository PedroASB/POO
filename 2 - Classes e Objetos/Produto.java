public class Produto {
	private int codigo, quantidade, dia, mes, ano;
	private String nome, tipo;
	private double valor;
	private boolean perecivel;

	Produto(){
	};

	Produto(int codigo, boolean perecivel){
		this.codigo = codigo;
		this.perecivel = perecivel;
	}

	public boolean retirar(int quantidade){
		if (quantidade > this.quantidade) return false;
		this.quantidade -= quantidade;
		return true;
	}

	public void repor(int quantidade){
		this.quantidade += quantidade;
	}

	public boolean vencido(int dia, int mes, int ano){
		if ((365 * ano + 30 * mes + dia) >
				(365 * this.ano + 30 * this.mes + this.dia)) return true;
		return false;
	}

	public String toString(){
		return ("Nome: " + this.nome +
		"\nCodigo: " + this.codigo +
		"\nTipo: " + this.tipo +
		"\nQuantidade: " + this.quantidade + "\n" +
		(this.perecivel ? "" : "Nao ") + "Perecivel" +
		"\nValidade: " + this.dia + "/" + this.mes + "/" + this.ano);
	}

	public static void main(String[] args){
		Produto p1 = new Produto(22982004, false);

		p1.nome = "Cool Product";
		p1.dia = 16;
		p1.mes = 12;
		p1.ano = 2024;
		p1.tipo = "Legendary Product";
		p1.quantidade = 80;
//		p1.codigo = 22982004;
//		p1.perecivel = false;

		System.out.println(p1);
		p1.retirar(30);
		p1.repor(50);
		System.out.println();
		System.out.println(p1);
		System.out.println("\n" + p1.vencido(18, 5, 2017));

	}
}