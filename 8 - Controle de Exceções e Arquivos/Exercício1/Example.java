package Exercício1;

public class Example {
    public static void main(String args[]) {
        Client client = new Client();

        // Teste 1
        System.out.println("-- Teste 1 --");
        try {
            client.connect("ABC123");
            client.request("RequestOne");
        }
        catch (ExceptionNotConnected excepNotConnected) {
            System.out.println("Erro - Cliente nao conectado - Requisicao: "
                    + excepNotConnected.getRequest());
        }

        // Teste 2
        System.out.println("\n-- Teste 2 --");
        try {
            client.request("RequestTwo");
        }
        catch (ExceptionNotConnected excepNotConnected) {
            System.out.println("Erro - Cliente nao conectado - Requisicao: "
                    + excepNotConnected.getRequest());
        }


    }
}
