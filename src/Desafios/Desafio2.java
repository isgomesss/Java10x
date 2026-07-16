package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 5;
        String[] nomes = new String[NUMERO_MAX];

        int nomesCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                        if (nomesCadastrados < NUMERO_MAX) {
                            for (int i = 0; i < nomes.length; i++) {
                                System.out.println("Digite o nome do ninja: ");
                                String nome = scanner.next();
                                nomes[i] = nome;
                                nomesCadastrados++;
                            }
                        }
                            else{
                                System.out.println("número de nomes atingido, n ta cabendo mais n pae");
                            }



                    break;
                case 2:
                    if (nomesCadastrados == 0){
                        System.out.println("A listas esta vazia, adicione o nome dos ninjas");
                    }else {
                        System.out.println("Listar ninjas");
                        for (int i = 0; i < nomes.length; i++) {
                            System.out.println(1 + i + " - " + nomes[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Numero inválido, tente nomante!");

            }
        }

    }
}
