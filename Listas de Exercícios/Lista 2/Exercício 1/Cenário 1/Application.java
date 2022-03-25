public class Application {
	public static void main(String args[]){
		Musica musica1 = new Musica("Nome1", "Tipo1", 1995);
		Musica musica2 = new Musica("Nome2", "Tipo2", 2005);
		Musica musica3 = new Musica("Nome3", "Tipo3", 2015);

		musica1.addCompositor(new Compositor("Comp1_1", "Brasileiro"));
		musica1.addCompositor(new Compositor("Comp1_2", "Brasileiro"));

		musica2.addCompositor(new Compositor("Comp2_1", "Estadunidense"));
		musica2.addCompositor(new Compositor("Comp2_2", "Canadense"));
		musica2.addCompositor(new Compositor("Comp2_3", "Estadunidense"));

		musica3.addCompositor(new Compositor("Comp3_1", "Brasileiro"));

		System.out.println("-- Musica 1 --");
		System.out.println(musica1);
		for (Compositor compositor : musica1.getCompositores()){
			System.out.println(compositor);
		}

		System.out.println("\n-- Musica 2 --");
		System.out.println(musica2);
		for (Compositor compositor : musica2.getCompositores()){
			System.out.println(compositor);
		}

		System.out.println("\n-- Musica 3 --");
		System.out.println(musica3);
		for (Compositor compositor : musica3.getCompositores()){
			System.out.println(compositor);
		}
	}
}
