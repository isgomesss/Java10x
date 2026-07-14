package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a nota do aluno? ");
        double nota = scanner.nextDouble();

        if (nota <= 4.9) {
            System.out.println("O aluno esta reprovado!");
        }

        else if (nota >= 5.0 && nota <= 5.9) {
            System.out.println("O aluno esta de recuperação!");
        }

        else {
            System.out.println("O aluno esta Aprovado! Parabens!");
        }
    }
}
