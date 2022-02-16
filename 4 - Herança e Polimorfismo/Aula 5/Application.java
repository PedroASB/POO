import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {

		ArrayList<ProgramaTV> programas = new ArrayList<>();

		ProgramaTV p = new ProgramaTV("O outro lado do paraíso", "Novela");
		p.diretor = new Diretor("Diretor 1", "Brasileiro");
		p.addArtista(new Artista("Artista 1", "Brasileiro", "Papel 1"));
		p.addArtista(new Artista("Artista 2", "Brasileiro", "Papel 2"));

		programas.add(p);

		p = new ProgramaTV("Orgulho e Paixão", "Novela");
		p.diretor = new Diretor("Diretor 2", "Brasileiro");
		p.addArtista(new Artista("Artista 3", "Brasileiro", "Papel 3"));
		p.addArtista(new Artista("Artista 4", "Brasileiro", "Papel 4"));

		programas.add(p);

		p = new ProgramaTV("Marley e eu", "Comédia");
		p.diretor = new Diretor("Diretor 3", "Brasileiro");
		p.addArtista(new Artista("Artista 5", "Brasileiro", "Papel 5"));
		p.addArtista(new Artista("Artista 6", "Brasileiro", "Papel 6"));
		programas.add(p);

		p = new ProgramaTV("Show Ivete Sangalo", "Show");
		p.diretor = new Diretor("Diretor 4", "Brasileiro");
		p.addArtista(new Artista("Artista 7", "Brasileiro", "Papel 7"));
		p.addArtista(new Artista("Artista 8", "Brasileiro", "Papel 8"));
		programas.add(p);

		for (ProgramaTV prog : programas) {
			System.out.println(prog);
		}

	}

}