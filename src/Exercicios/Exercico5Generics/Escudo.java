package Exercicios.Exercico5Generics;

public class Escudo {

    private String nome;
    private int defesa;

    public Escudo(int defesa, String nome) {
        this.defesa = defesa;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Escudo: " + nome + "\nDefesa: " + defesa;

    }
}


