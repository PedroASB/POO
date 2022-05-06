public class Application {
	public static void main(String args[]) {
		Endereco endereco1 = new Endereco("Rua R-25", 184, "Savassi",
				"Qd 105, Lt 18", "Belo Horizonte", "Minas Gerais");
		Endereco endereco2 = new Endereco("Rua R-08", 307, "Ondina ",
				"Qd 132, Lt 9", "Salvador", "Bahia");

		Cliente cliente1 = new Cliente("Marcos", "307.459.730-51", endereco1);
		Cliente cliente2 = new Cliente("Juliana", "424.823.330-40", endereco2);

		System.out.println("-- Cliente 1 --");
		System.out.println(cliente1);

		System.out.println("\n-- Cliente 2 --");
		System.out.println(cliente2);

	}
}
