package Empresa;

public class Endereco {
	public int numero;
	public String rua;
	public String bairro;
	public String complemento;
	public String cidade;
	public String estado;

	// toString
	public String toString() {
		return "Rua: " + rua + "\nNumero: " + numero +
				"\nComplemento: " + complemento + "\nBairro: "
				+ bairro + "\nCidade: " + cidade + "\nEstado: " +
				estado;
	}

	// Getters
	public int getNumero() {
		return numero;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	// Setters
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
