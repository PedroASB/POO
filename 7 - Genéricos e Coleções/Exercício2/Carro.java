package Exercício2;

public class Carro {
    public String placa;
    public String modelo;
    public String cor;

    public Carro(String placa, String modelo, String cor){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Carro carro = (Carro) o;
        return placa.equals(carro.placa);
    }

    @Override
    public int hashCode() {
        return placa.hashCode();
    }

    public String toString(){
        return "Placa: " + placa + "\nModelo: " + modelo +
                "\nCor: " + cor;
    }
}
