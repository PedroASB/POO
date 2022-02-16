import java.util.Date;
import java.text.SimpleDateFormat;

public class Morador {
	/* Atributos */

	private int id;
	private static int cont = 0;
	private char sexo;
	private Date dataNascimento;
	private String nome;
	private String cpf;
	private String telefone;
	private String codigoAcesso;

	/* Métodos */

	// Construtor
	public Morador(){
		dataNascimento = new Date();
		cont++;
		id = cont;
	}

	// Getters
	public int getID() {
		return id;
	}

	public char getSexo() {
		return this.sexo;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCPF() {
		return this.cpf;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}

	// Setters
	public void setSexo(char sexo) {
		if (sexo == 'M' || sexo == 'F' || sexo == 'm' || sexo == 'f'){
			this.sexo = sexo;
		}
	}

	public void setDataNascimento(String dataNascimento) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dataNascimento = dateFormat.parse(dataNascimento);
		}
		catch (Exception e) {
			System.out.println("Formato da data de nascimento invalido.");
			System.exit(0);
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCodigoAcesso(String codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

	// toString
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return "Nome: " + nome + "\nID: " + id + "\nCPF: " +
				cpf + "\nSexo: " + sexo + "\nNascimento: " +
				dateFormat.format(dataNascimento) + "\nTelefone: " +
				telefone + "\nCodigo de Acesso: " +
				codigoAcesso;
	}

}
