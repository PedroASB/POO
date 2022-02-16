package Empresa;

public class Empresa {
	public String cpnj;
	public String razao;
	private Endereco endereco;

	// Constructors
	public Empresa(){
		this.endereco = new Endereco();
	}

	public Empresa(String razao){
		this.endereco = new Endereco();
		this.razao = razao;
	}

	// Printer
	public void print(){
		System.out.println("Razao Social: " + this.razao);
		System.out.println("CPNJ: " + this.cpnj);
		System.out.println("\n| Endereco da Empresa |");
		System.out.println(this.endereco);
	}

	// Getters
	public String getCpnj() {
		return cpnj;
	}

	public String getRazao() {
		return razao;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	// Setters
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}
}
