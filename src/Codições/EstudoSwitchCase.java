package Codições;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu personagem favorito de Breaking Bad: ");
        System.out.println("1 - Walter White");
        System.out.println("2 - Jesse Pinkman ");
        System.out.println("3 - Mike Ehrmantraut ");
        System.out.println("4 - Jane Margolis");

        System.out.print("Digite aqui: ");
        String escolha = scanner.nextLine();

        switch (escolha){
            case "um":
                System.out.println("Você escolheu Walter White, e tem carater duvidoso");
                break;
            case "dois":
                System.out.println("Você escolheu Jesse Pinkman, e é usuario de droga");
                break;
            case "tres":
                System.out.println("Você escolheu Mike Ehrmantraut, e tem otimo gosto para personagem!");
                break;
            case "quatro":
                System.out.println("Você escolheu Jane Margolis, talvez vc deva pensar em suicidio");
                break;
            default:
                System.out.println("ERRO!!!! Personagem não encontrado! MELHORE");

        }





        scanner.close();

    }
}
