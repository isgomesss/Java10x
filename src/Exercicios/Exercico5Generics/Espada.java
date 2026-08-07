package Exercicios.Exercico5Generics;

public class Espada {

    private String nome;

    public Espada(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Espada" + nome;
    }
}
