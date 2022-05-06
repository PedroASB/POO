import java.util.List;
import java.util.LinkedList;

public class Musica {
	private String nome;
	private String tipo;
	private int ano;
	private List<Compositor> compositores = new LinkedList<>();

	public Musica(String nome, String tipo, int ano){
		this.nome = nome;
		this.tipo = tipo;
		this.ano = ano;
	}

	public String toString() {
		StringBuilder compositoresString = new StringBuilder();

		for (Compositor c : compositores) {
			compositoresString.append(c).append("\n");
		}

		return "Nome da musica: " + nome + "\nTipo: " +
				tipo + "\nAno: " + ano + "\n| Compositores |\n" +
				compositoresString;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getAno() {
		return ano;
	}

	public List<Compositor> getCompositores() {
		return compositores;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void addCompositor(Compositor compositor) {
		compositores.add(compositor);
	}

}
