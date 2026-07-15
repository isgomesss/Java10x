package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        System.out.println("CALCULADORA SIMPLES");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° numero decimal: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o 2° numero decimal: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Qual operação você deseja? (+,-,*,/)");
        String operador = scanner.next();

        switch (operador) {
            case "+":
                System.out.println(numero1 + numero2);
                break;

            case "-":
                System.out.println(numero1 - numero2);
                break;

            case "*":
                System.out.println(numero1 * numero2);
                break;

            case "/":
                if (operador == "/" || numero2 == 0 ){
                    System.out.println("Erro! Divisão por zero");
                }
                System.out.printf(String.valueOf(numero1 / numero2));
                break;
            default:
                System.out.println("Operação invalido");
        }


    }
}

