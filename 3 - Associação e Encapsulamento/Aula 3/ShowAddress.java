public class ShowAddress {
	public static void main(String[] args) {

		Endereco e = new Endereco("Av. Brasil", "171");

		Funcionario f1 = new Funcionario("Vendedor1", 14598, "000.000.000-00");

		f1.endereco = e;

		Funcionario f2 = new Funcionario("Vendedor2", 74562, "111.111.111-11");

		f2.endereco = e;

		f1.endereco.setRua("Av. Atlantica");

		System.out.println(f2.endereco.getRua());
	}
}