package Exercício2;

import java.util.UUID;

public class Produto implements Archivable {
	private UUID id;
	private String nome;
	private String categoria;
	private double precoUnitario;

	public Produto(){
		this.id = UUID.randomUUID();
	}

	public Produto(String nome, String categoria, double precoUnitario) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.categoria = categoria;
		this.precoUnitario = precoUnitario;
	}

	public String toString() {
		return "Nome: " + nome +
				"\nID: " + id +
				"\nCategoria: " + categoria +
				"\nPreco: " + precoUnitario;
	}

	// Archivable

	@Override
	public UUID getID(){
		return id;
	}

	@Override
	public Object getClone() {
		Produto clone = new Produto(nome, categoria, precoUnitario);

		// o "clone" gera um ID novo, mas ele deve ser o mesmo do produto
		clone.id = this.id;

		return clone;
	}

	// Getters

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	// Setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
}
