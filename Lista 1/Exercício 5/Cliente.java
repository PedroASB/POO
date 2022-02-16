import java.util.Date;
import java.text.SimpleDateFormat;

public class Cliente extends Pessoa {
	/* Atributos */
	private String cpf;
	private String status = "ativo";
	Date dataNascimento;

	/* Métodos */

	// Construtores
	public Cliente(){
	}

	public Cliente(String nome, String telefone, String cpf, String dataNascimento){
		super(nome, telefone);
		this.cpf = cpf;
		setDataNascimento(dataNascimento);
	}

	// Getters
	public String getCpf() {
		return cpf;
	}

	public String getStatus() {
		return status;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	// Setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	// Outros métodos
	public boolean desativar() {
		if (status.equals("inativo"))
			return false;
		this.status = "inativo";
		return true;
	}

	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return "Nome: " + nome + " | Telefone: " + telefone +
				" | Data de nascimento: " + dateFormat.format(dataNascimento)
				+ " | CPF: " + cpf + " | Status: " + status + "(a)";
	}
}
