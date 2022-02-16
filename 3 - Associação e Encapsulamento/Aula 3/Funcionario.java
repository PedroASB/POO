public class Funcionario {
	// Attributes

	private int matricula;
	private double salario;
	private String nome, cpf, cargo, departamento;
	public Endereco endereco;

	// Constructors

	public Funcionario(){
		this.endereco = new Endereco();
	}

	public Funcionario(String nome, int matricula, String cpf){
		if (!validarCPF(cpf)) System.exit(1);
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.endereco = new Endereco();
	}

	// Auxiliary Methods

	private boolean validarCPF(String cpf) {
		int soma1, soma2, resto1, resto2;
		byte[] bytes = cpf.getBytes();

		for (int i = 0; i < bytes.length; i++){
			bytes[i] = (byte) (bytes[i] - 48);
		}

		// OBS.: Validação dos CPFs inválidos conhecidos

		soma1 = bytes[0] * 10 + bytes[1] * 9 + bytes[2] * 8 +
				bytes[4] * 7 + bytes[5] * 6 + bytes[6] * 5 +
				bytes[8] * 4 + bytes[9] * 3 + bytes[10] * 2;

		resto1 = (soma1 * 10) % 11;
		if (resto1 == 10) resto1 = 0;

		soma2 = bytes[0] * 11 + bytes[1] * 10 + bytes[2] * 9 +
				bytes[4] * 8 + bytes[5] * 7 + bytes[6] * 6 +
				bytes[8] * 5 + bytes[9] * 4 + bytes[10] * 3 + bytes[12] * 2;

		resto2 = (soma2 * 10) % 11;
		if (resto2 == 10) resto2 = 0;

		return ( (resto1 == bytes[12]) && (resto2 == bytes[13]) );
	}

	// Setters

	public void setMatricula(int matricula){
		this.matricula = matricula;
	}

	public void setSalario(double salario){
		if (salario > 0.0)
			this.salario = salario;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCPF(String cpf){
		if (!validarCPF(cpf)) System.exit(1);
		this.cpf = cpf;
	}

	public void setCargo(String cargo){
		switch (cargo) {
			case "gerente", "vendedor", "caixa" -> this.cargo = cargo;
		}
		/*
		if (cargo.equals("gerente") || cargo.equals("vendedor")
				|| cargo.equals("caixa")){
			this.cargo = cargo;
		}
		*/
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	// Getters

	public int getMatricula(){
		return this.matricula;
	}

	public double getSalario(){
		return this.salario;
	}

	public String getNome(){
		return this.nome;
	}

	public String getCPF(){
		return this.cpf;
	}

	public String getCargo(){
		return this.cargo;
	}

	public String getDepartamento(){
		return this.departamento;
	}

	// toString

	public String toString(){
		return (this.matricula + " – " + this.nome + " (" + this.cpf +
				") – Departamento : " + this.departamento +
				" – Cargo : " + this.cargo);
	}

}
