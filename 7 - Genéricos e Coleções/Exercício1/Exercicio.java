package Exercício1;

import java.util.*;

public class Exercicio {

    public static void main(String[] args) {
        List<Cliente> clientes = new LinkedList<>(); // Teste 1
//        Set<Cliente> clientes = new HashSet<>(); // Teste 2

        Cliente c1 = new Cliente("000.000.000-00", "Sisifo Modus Operandi", "7980-2222");
        Cliente c2 = new Cliente("000.000.000-00", "Sisifo M. Operandi", "7980-2222");
        Cliente c3 = new Cliente("000.000.000-00", "S. M. Operandi", "7980-2222");

        System.out.println("Hash(c1): " + c1.hashCode());
        System.out.println("Hash(c2): " + c2.hashCode());
        System.out.println("Hash(c3): " + c3.hashCode());

        System.out.println("---");

        System.out.println("(c1 == c2)? Resposta: " + c1.equals(c2));
        System.out.println("(c1 == c3)? Resposta: " + c1.equals(c3));
        System.out.println("(c2 == c3)? Resposta: " + c2.equals(c3));

        System.out.println("---");

        clientes.add(c1);
        clientes.add(c2);
        System.out.println("clientes.size() ->: " + clientes.size());

        System.out.println("---");

        System.out.println("Contains c3? Resposta: " + clientes.contains(c3));

    }

}