package Musicas;

import java.util.ArrayList;
import java.util.Collections;

public class Musica {
	private int ano;
	private String nome;
	private String tipo;
	private ArrayList<Compositor> compositores = new ArrayList<Compositor>();

	// Constructors
	public Musica(){
	}

	public Musica(String nome){
		this.nome = nome;
	}

	// Printer
	// CRIAR UMA TO STRING
	public void print(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Ano: " + this.ano);

		int i = 1;
		for (Compositor comp : compositores){
			System.out.println("\nCOMPOSITOR #" + i);
			System.out.println(comp);
			i++;
		}
	}

	// Compositores
	public void addCompositor(Compositor compositor){
		compositores.add(compositor);
	}

	public void removeCompositor(Compositor compositor){
//		compositores.remove(compositor);
		for (int i = 0; i < compositores.size(); i++){
			if (compositores.get(i).getNome().equals(compositor.getNome())){
				compositores.remove(i);
				break;
			}
		}
	}

	public ArrayList<Compositor> getMesas() {
		ArrayList<Compositor> clone = new ArrayList<>();
		Collections.copy(compositores, clone);
		return clone;
	}

	// Getters
	public int getAno() {
		return ano;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	// Setters
	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
