package Exercício1;

public class Produto {
//  private static long seq = 0;
    private long id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
//      this.id = seq++;
        this.id = Sequencial.getInstance().next();
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return nome + " (" + id + "): R$" + preco;
    }

}