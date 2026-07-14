package Exercicios;

public class Exercicio3 {
    public static void main(String[] args) {

        String nome = "Isadora Gomes Oliveira";
        System.out.println("Nome: " + nome);

        String nomeMaiusculo = nome.toUpperCase();
        System.out.println("Maiusculo? " + nome.toUpperCase());

        String nomeMinusculo = nome.toLowerCase();
        System.out.println("Minusculo? " + nome.toLowerCase());

        int tamanho = nome.length();
        System.out.println("Tamanho: " + tamanho);


        boolean contem = nome.contains("a");
        System.out.println("Contem 'a'? " + contem);


    }
}
