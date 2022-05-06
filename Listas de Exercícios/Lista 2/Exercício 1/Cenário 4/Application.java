public class Application {
	public static void main(String args[]) {
		Endereco endereco1 = new Endereco("Rua R-32", 17, "Vila Santana",
				"Qd 52, Lt 5", "Parana", "Curitiba");
		Endereco endereco2 = new Endereco("Rua R-27", 148, "Jd. Oliveira",
				"Qd 129, Lt 11", "Vitoria", "Espirito Santo");

		Empresa empresa1 = new Empresa("41.468.303/0001-10", "Industria ABC Ltda.", endereco1);
		Empresa empresa2 = new Empresa("59.493.725/0001-01", "Cosmeticos CBA", endereco2);

		Empregado empregado1 = new Empregado("Gilberto", 5008962, empresa1);
		Empregado empregado2 = new Empregado("Marina", 6724789, empresa2);
		Empregado empregado3 = new Empregado("Paulo", 5009321, empresa1);

		System.out.println("-- Empregado(a) 1 --");
		System.out.println(empregado1);
		System.out.println("\n-- Empregado(a) 2 --");
		System.out.println(empregado2);
		System.out.println("\n-- Empregado(a) 3 --");
		System.out.println(empregado3);
	}
}