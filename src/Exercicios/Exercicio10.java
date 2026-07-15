package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE MATRICULAS");

        System.out.println("Nome completo: ");
        String nome = scanner.next();


        System.out.println("Qual a sua idade: ");
        int idade = scanner.nextInt();

            while (idade <= 0 || idade >=
                    120) {
                System.out.println("Idade inválida! Tente novamente");
                System.out.println("Qual a sua idade?");
                idade = scanner.nextInt();
            }
            String idadeV = (idade >+ 18) ? "Aluno maior de idade" : "Aluno menor de idade";


            System.out.println("Qual a media final? ");
            double media = scanner.nextDouble();
            if (media >= 7.0){
                System.out.println("Aprovado");
            }
            else if (media > 5.0 || media < 6.9) {
                System.out.println("Recuperação");
            }
            else {
                System.out.println("Reprovado");
            }


        System.out.println("Qual turno desejado?");
        System.out.println("Manhã");
        System.out.println("Tarde");
        System.out.println("Noite");
        String turno = scanner.next();

        switch (turno){
            case "Manhã":
                System.out.println("Você escolheu Manhã");
                break;
            case "Tarde":
                System.out.println("Você escolheu Tarde");
                break;
            case "Noite":
                System.out.println("Você escolheu Noite");
                break;
            default:
                System.out.println("Turno inválido");
        }

        System.out.println("");
        System.out.println("Nome completo: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aluno maior de idade? " + idadeV);
        System.out.println("Media do aluno: " + media);
        System.out.println("Turno desejado: " + turno);

    }
}
