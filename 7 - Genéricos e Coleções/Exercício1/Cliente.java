package Exercício1;

public class Cliente {
    public String cpf;
    public String nome;
    public String telefone;

    public Cliente(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Cliente c = (Cliente)o;
        return cpf.equals(c.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }

}