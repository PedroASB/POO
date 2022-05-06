package Exercício2;

public class SMS extends Notificacao {

    public void enviar(){
        System.out.println("Telefone: ");
        System.out.println(telefone);
        System.out.println("\nResumo: ");
        System.out.println(resumo);
        System.out.println("\nRemetente: ");
        System.out.println(remetente);
    }
}
