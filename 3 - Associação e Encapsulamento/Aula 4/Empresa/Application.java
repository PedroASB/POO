package Empresa;

public class Application {
	public static void main(String[] args){
		Empregado empregado1 = new Empregado("Fulano");

		empregado1.setMatricula(123456);
		empregado1.getEmpresa().setRazao("EmpresaX");
		empregado1.getEmpresa().setCpnj("abcde");
		empregado1.getEmpresa().getEndereco().setRua("Ruazinha");
		empregado1.getEmpresa().getEndereco().setNumero(18);
		empregado1.getEmpresa().getEndereco().setBairro("Bairrozada");
		empregado1.getEmpresa().getEndereco().setComplemento("Comp");
		empregado1.getEmpresa().getEndereco().setCidade("City");
		empregado1.getEmpresa().getEndereco().setEstado("State");

		empregado1.print();
	}
}
