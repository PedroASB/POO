package Exercício1;

public class Pessoa {
//  private static long seq = 0;
    private long id;
    private String nome;

    public Pessoa(String nome) {
//      this.id = seq++;
        this.id = Sequencial.getInstance().next();
        this.nome = nome;
    }

    public String toString() {
        return nome + " (" + id + ")";
    }
}