package Exercício2;

public class Carta extends Notificacao{

    public void enviar(){
        System.out.println("Endereco: ");
        System.out.println(endereco);
        System.out.println("\nDestinatario: ");
        System.out.println(destinatario);
        System.out.println("\nTexto: ");
        System.out.println(texto);
        System.out.println("\nRemetente: ");
    }
}
