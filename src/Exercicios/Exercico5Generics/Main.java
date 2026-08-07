package Exercicios.Exercico5Generics;

public class Main {
    public static void main(String[] args) {

        Mochila<Object> mochila = new Mochila<>();
        mochila.adicionarItem(new Pocao("do amor", 100));
        mochila.adicionarItem(new Espada(" de ouro"));
        mochila.adicionarItem(new Escudo(100, "Rogerio"));
        mochila.adicionarItem(new Pergaminho("Joao Marcelo"));

        System.out.println("Itens da mochila: ");
        mochila.mostrarItens();
    }
}
