public class Endereco {
	// Attributes

	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String complemento;
	private String numero;

	// Constructors

	public Endereco(){
	}

	public Endereco(String rua, String numero){
		this.rua = rua;
		this.numero = numero;
	}

	// Setters

	public void setEstado(String estado){
		this.estado = estado;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public void setRua(String rua){
		this.rua = rua;
	}

	public void setComplemento(String complemento){
		this.complemento = complemento;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}

	// Getters

	public String getEstado(){
		return this.estado;
	}

	public String getCidade(){
		return this.cidade;
	}

	public String getBairro(){
		return this.bairro;
	}

	public String getRua(){
		return this.rua;
	}

	public String getComplemento(){
		return this.complemento;
	}

	public String getNumero(){
		return this.numero;
	}

	// toString

	public String toString(){
		return ("Endereço: " + this.rua + ", " + this.numero + ", " +
				this.complemento + ", " + this.bairro + ", " +
				this.cidade + ", " + this.estado + ".");
	}

}
