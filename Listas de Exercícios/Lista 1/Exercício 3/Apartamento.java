import java.util.ArrayList;

public class Apartamento {
	/* Atributos */

	private char bloco;
	private int andar;
	private int numero;
	private double metragem;
	private String situacao;
	private ArrayList<Morador> moradores;

	/* Métodos */

	// Construtor
	public Apartamento(){
		moradores = new ArrayList<>();
	}

	// Getters
	public char getBloco() {
		return bloco;
	}

	public int getAndar() {
		return andar;
	}

	public int getNumero() {
		return numero;
	}

	public double getMetragem() {
		return metragem;
	}

	public String getSituacao() {
		return situacao;
	}

	public ArrayList<Morador> getMoradores() {
		return moradores;
	}

	// Setters
	public void setBloco(char bloco) {
		this.bloco = bloco;
	}

	public boolean setAndarNumero(int andar, int numero) {
		this.andar = andar;
		if (numero < andar * 100 || numero > andar * 100 + 99) {
			return false;
		}
		this.numero = numero;
		return true;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	public void setSituacao(String situacao) {
		if (situacao.equals("alugado") || situacao.equals("financiado")
				|| situacao.equals("quitado")) {
			this.situacao = situacao;
		}
	}

	public void setMoradores(ArrayList<Morador> moradores) {
		this.moradores = moradores;
	}

}


