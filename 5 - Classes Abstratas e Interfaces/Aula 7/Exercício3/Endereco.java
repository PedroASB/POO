package Exercício3;

public class Endereco implements Cloneable {
	private String cidade;
	private String bairro;
	private String rua;
	private String cep;
	private int numero;

	public Endereco(){}

	public Endereco(String cidade, String bairro, String rua,
					String cep, int numero){
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
	}

	public String toString() {
		return "Cidade: " + cidade +
				"\nBairro: " + bairro +
				"\nRua: " + rua +
				"\nCEP: " + cep +
				"\nNumero: " + numero;
	}

	@Override
	public Object getClone() {
		return new Endereco(cidade, bairro, rua, cep, numero);
	}

	// Getters

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}

	public String getCep() {
		return cep;
	}

	public int getNumero() {
		return numero;
	}

	// Setters

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
