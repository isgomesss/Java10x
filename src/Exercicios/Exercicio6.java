package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        while (idade < 0) {
            System.out.println("Idade inválida! Tente novamente");
            System.out.println("Qual a sua idade?");
            idade = scanner.nextInt();
        }


        if (idade < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }

    }
}
