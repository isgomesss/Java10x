package Desafios.Desafios3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int NUM_MAXIMO = 3;
        int opcao = 0;
        int ninjaCadastrado = 0;

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Uchiha[] uchihas = new Uchiha[NUM_MAXIMO];

        while (opcao != 4){

            System.out.println(menu.menu());
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (ninjaCadastrado < NUM_MAXIMO) {
                        for (int i = 0; i < NUM_MAXIMO; i++) {
                            Uchiha ninjaUchiha = new Uchiha();

                            System.out.println("1. Cadastrar Ninja.");
                            System.out.println("Digite o nome do ninja: ");
                            String nomeNinja = scanner.next();
                            ninjaUchiha.nome = nomeNinja;

                            System.out.println("Digite a idade do ninja: ");
                            ninjaUchiha.idade = scanner.nextInt();

                            System.out.println("Digite a missão do ninja: ");
                            scanner.nextLine();
                            String missaoNinja = scanner.nextLine();
                            ninjaUchiha.missao = missaoNinja;

                            System.out.println("Digite o nivel de dificuldade da missão do ninja: ");
                            String dificuldadeNinja = scanner.nextLine();
                            ninjaUchiha.nivelDeDificudade = dificuldadeNinja;

                            System.out.println("Digite o status da missão do ninja: ");
                            String statusNinja = scanner.nextLine();
                            ninjaUchiha.statusDaMissao = statusNinja;

                            System.out.println("Habilidade Especial do ninja?");
                            String habilidadeNinja = scanner.nextLine();
                            ninjaUchiha.habilidadeEspecial = habilidadeNinja;

                            System.out.println("Informações do ninja cadastrado com sucesso!");
                            System.out.println("====================================================");
                            uchihas[i] = ninjaUchiha;
                            ninjaCadastrado++;
                        }
                    } else {
                        System.out.println("Lista cheia! \n");
                    }
                    break;

                case 2:
                    if (ninjaCadastrado == 0) {
                        System.out.println("Nenhum ninja cadastrado! \n");
                    } else {
                        for (int i = 0; i < NUM_MAXIMO; i++) {
                            System.out.println(uchihas[i].mostrarInformacoes() + "\n");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < NUM_MAXIMO; i++) {
                        Uchiha ninjaUchiha = new Uchiha();
                        System.out.println("Ha habilidade especial do ninja é: " + uchihas[i].mostrarHabilidadeEspecial());
                        System.out.println("Qual a nova habilidade especial do ninja? \n");
                        String novaHabilidade = scanner.next();
                        ninjaUchiha.habilidadeEspecial = novaHabilidade;

                        uchihas[i].habilidadeEspecial = ninjaUchiha.habilidadeEspecial;
                    }
                    break;

                case 4:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção invalida \n");
            }
        }
    }
}
