package Exercicios.Exercico5Generics;

public class Pocao {

    private String nome;
    private int quantidadeCura;

    public Pocao(String nome, int quantidadeCura) {
        this.nome = nome;
        this.quantidadeCura = quantidadeCura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeCura() {
        return quantidadeCura;
    }

    public void setQuantidadeCura(int quantidadeCura) {
        this.quantidadeCura = quantidadeCura;
    }

    @Override
    public String toString() {
        return "Pocao " + nome + "\nQuantidade de cura " + quantidadeCura;

    }
}
