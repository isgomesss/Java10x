package Iniciante.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numInteiro = scanner.nextInt();

        String parOuImpar = (numInteiro % 2 == 0 ) ? "Par" : "Impar";

        String negOuPosi = (numInteiro >= 0 ) ? "Positivo" : "Negativo";

        System.out.println("O numero é " + parOuImpar + " e " + negOuPosi);
    }
}
