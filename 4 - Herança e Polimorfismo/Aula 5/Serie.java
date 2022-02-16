public class Serie extends ProgramaTV {
	private int qtdTemporadas;

	public Serie(String nome, String categoria, int qtdTemporadas){
		super(nome, categoria);
		this.qtdTemporadas = qtdTemporadas;
	}

	public int getQtdTemporadas() {
		return qtdTemporadas;
	}

	public void setQtdTemporadas(int qtdTemporadas) {
		this.qtdTemporadas = qtdTemporadas;
	}

	// Obs.: super.toString()
	public String toString() {
		String programa = nome + " (" + categoria + ")\n";
		programa = programa + "Temporadas : " + qtdTemporadas + "\n";
		programa = programa + "Diretor : " + diretor.getNome() + "\n";
		programa = programa + "Artistas : \n";
		for (Pessoa a : artistas) {
			programa = programa + a.getNome() + "\n";
		}
		return programa;
	}

}
