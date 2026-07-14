package Exercicios;

public class Exercicio5 {
    public static void main(String[] args) {

        /*Exercício 5 — Jutsu do Narutinho
        Dificuldade: Médio   |   Tópico: Condicionais aninhadas
        Enunciado:O Narutinho tem um nível de chakra (int, de 0 a 100) e uma quantidade de kunais (int).
        Crie uma lógica que decida qual jutsu ele pode usar:
        Exemplo:
        - Se chakra >= 80: pode usar "Rasengan"
        - Se chakra >= 40 e < 80: pode usar "Kage Bunshin" (clones), mas só se tiver pelo menos 1 kunai sobrando
        - Se chakra < 40: só pode usar "Kunai" comum (e precisa ter pelo menos 1)
        - Se não atender nenhuma condição, imprima "Sem chakra e sem kunai, corre!"
        */

        int chakra = 40;
        int kunais = 0;

        System.out.println("Quantidade de chakra: " + chakra);
        System.out.println("Quantidade de kunais " + kunais);


            if (chakra >= 80 && kunais >= 0) {
                System.out.println("Você pode usar Rasenga");
            }

            else if (chakra >= 40 && kunais >= 1) {
                System.out.println("Você pode usar Kage Bunshin");
            }

            else if (chakra < 40 && kunais >= 1) {
                System.out.println("Você pode usar Kunai comum");
            }

            else {
                System.out.println("Sem chakra e sem kunai, corre!");
            }
    }
}
