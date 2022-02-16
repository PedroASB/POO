package Musicas;

public class Application {
	public static void main(String[] args){
		Musica musica1 = new Musica();
		Compositor compositor1 = new Compositor();
		Compositor compositor2 = new Compositor();

		musica1.setNome("Musica1");
		musica1.setAno(2015);
		musica1.setTipo("Tipo1");

		compositor1.setNome("CompOne");
		compositor1.setNacionalidade("NacionOne");
		musica1.addCompositor(compositor1);

		compositor2.setNome("CompTwo");
		compositor2.setNacionalidade("NacionTwo");
		musica1.addCompositor(compositor2);

		musica1.removeCompositor(compositor2);

		musica1.print();

	}
}
