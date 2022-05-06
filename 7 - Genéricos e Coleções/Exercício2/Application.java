package Exercício2;

public class Application {
    public static void main(String args[]) {
        Empresa empresa = new Empresa();

        Carro carro1 = new Carro("123456", "Brasilia", "Amarela");
        Carro carro2 = new Carro("456789", "Fuscao", "Preto");
        Carro carro3 = new Carro("654987", "Ferrari", "Vermelha");

        empresa.add(carro1);
        empresa.add(carro2);
        empresa.add(carro3);

        empresa.list();

        Carro carro;

        System.out.println("Procurando carro de placa 123456");
        carro = empresa.find("123456");
        if (carro != null)
            System.out.println(carro + "\n");
        else
            System.out.println("Carro nao encontrado\n");


        System.out.println("Procurando carro de placa 456789");
        carro = empresa.find("456789");
        if (carro != null)
            System.out.println(carro + "\n");
        else
            System.out.println("Carro nao encontrado\n");


        System.out.println("Procurando carro de placa 654987");
        carro = empresa.find("654987");
        if (carro != null)
            System.out.println(carro + "\n");
        else
            System.out.println("Carro nao encontrado\n");

        System.out.println("Procurando carro de placa 71698432");
        carro = empresa.find("71698432");
        if (carro != null)
            System.out.println(carro + "\n");
        else
            System.out.println("Carro nao encontrado\n");
    }
}
