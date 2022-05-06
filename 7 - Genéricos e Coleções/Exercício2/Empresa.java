package Exercício2;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private List<Carro> carros = new LinkedList<>();
//    private Map<String, Carro> carros = new HashMap<>();

    public void add(Carro carro){
        carros.add(carro);

//        carros.put(carro.placa, carro);
    }

    public Carro find(String placa){
        for (Carro carro : carros){
            if (carro.placa.equals(placa))
                return carro;
        }
        return null;

//        return carros.get(placa);
    }

    public void list(){
        for (Carro carro : carros)
            System.out.println(carro + "\n");

//        for (Carro carro : carros.values())
//            System.out.println(carro + "\n");
    }
}
