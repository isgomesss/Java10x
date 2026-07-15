package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardapio lanchonete: ");
        System.out.println("1 - Hamburguer (R$ 18,00)");
        System.out.println("2 - Batata-Frita (R$ 10,00)");
        System.out.println("3 - Refrigerante (R$ 6,00)");
        System.out.println("4 - Suco (R$ 8,00)");

        System.out.println("Digite aqui seu pedido: ");
        String escolha = scanner.nextLine();

        switch (escolha){
            case "um":
                System.out.println("Você escolheu Hamburguer! Total R$ 18,00");
                break;
            case "dois":
                System.out.println("Você escolheu Batata-Frita! Total R$ 10,00");
                break;
            case "tres":
                System.out.println("Você escolheu Refrigerante! Total R$ 6,00");
                break;
            case "quatro":
                System.out.println("Você escolheu Suco! R$ 8,00");
                break;
            default:
                System.out.println("Opção invalida!");
        }




    }
}
