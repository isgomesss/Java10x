package Desafios.Desafio6;

public class Ninja {

    String nome;
    int idade;
    String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "Ninja: " + nome + ", idade: " + idade + ", " + vila;
    }
}
