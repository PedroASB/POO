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
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.endereco = new Endereco();
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
