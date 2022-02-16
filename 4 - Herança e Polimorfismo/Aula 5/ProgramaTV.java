import java.util.ArrayList;

public class ProgramaTV {
	protected String nome;
	protected String categoria;
	protected Pessoa diretor;
	protected ArrayList<Artista> artistas = new ArrayList <>();

	public ProgramaTV(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;

	}

	public String getNome(){
		return nome;
	}

	public String getCategoria(){
		return categoria;
	}

	public Pessoa getDiretor(){
		return diretor;
	}

	public ArrayList<Artista> getArtistas(){
		return artistas;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCategoria(String categoria){
		this.categoria = categoria;
	}

	public void setDiretor(Pessoa diretor){
		this.diretor = diretor;
	}

	void addArtista(Artista artista) {
		artistas.add(artista);
	}

	public String toString() {
		String programa = nome + " (" + categoria + ")\n";
		programa = programa + "Diretor : " + diretor.getNome() + "\n";
		programa = programa + "Artistas : \n";
		for (Pessoa a : artistas) {
			programa = programa + a.getNome() + "\n";
		}
		return programa;
	}

}