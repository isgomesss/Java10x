package Codições;

import java.util.Scanner;

public class ScannerCondições {
    public static void main(String[] args) {

        /*
         *Scanner: jeito de trazer o usuario para dentro da aplicação
        */


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeninja = teclado.nextLine();

        System.out.println("Qual a idade do ninja? ");
        int idade = teclado.nextInt();

        if (idade < 18){
            System.out.println("Entrada não permitida para menores de 18 anos!");
        }
        else {
            System.out.println("Bem vindo! Otimo filme delicia");
        }

        System.out.println("O nome do ninja é: " + nomeninja);
        System.out.println("A idade do ninja é: " + idade);



        teclado.close();

    }
}
