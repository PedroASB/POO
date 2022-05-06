package Exercício1;

public class Application {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Pessoa pessoa = new Pessoa("Fulano" + i);
            System.out.println(pessoa);
            Produto produto = new Produto("Caneta" + i, 3.25);
            System.out.println(produto);
        }

    }
}