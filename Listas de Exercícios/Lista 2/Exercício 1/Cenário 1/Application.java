public class Application {
	public static void main(String args[]){
		Musica musica1 = new Musica("Meu Brasil", "MPB", 1993);
		Musica musica2 = new Musica("The Unbelievable Song", "Pop", 2015);
		Musica musica3 = new Musica("Criatividade Ltda.", "Rock", 2008);

		musica1.addCompositor(new Compositor("Carlos", "Brasileiro"));
		musica1.addCompositor(new Compositor("Larissa", "Brasileira"));

		musica2.addCompositor(new Compositor("John", "Estadunidense"));
		musica2.addCompositor(new Compositor("Michael ", "Canadense"));
		musica2.addCompositor(new Compositor("Mary", "Estadunidense"));

		musica3.addCompositor(new Compositor("Mateus", "Brasileiro"));

		System.out.println("-- Musica 1 --");
		System.out.print(musica1);

		System.out.println("\n-- Musica 2 --");
		System.out.print(musica2);

		System.out.println("\n-- Musica 3 --");
		System.out.print(musica3);
	}
}
