package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        String ninja1 = "Naruto";
        int idade1 = 15;
        String missao1 = "Achar o pergaminho";
        char nivelMissao1 = 'C';
        String status1 = "Andamento";


        String ninja2 = "Sasuke";
        int idade2 = 15;
        String missao2 = "Matar Itachi";
        char nivelMissao2 = 'A';
        String status2 = "Andamento";


        String ninja3 = "Sakura";
        int idade3 = 14;
        String missao3 = "Beijar Sasuke";
        char nivelMissao3 = 'D';
        String status3 = "Andamento";

        System.out.println();
        System.out.println("Ninja 1");
        System.out.println("Nome: " + ninja1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missão: " + missao1);
        System.out.println("Nivel: " + nivelMissao1);


        if (idade1 >= 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'D') {
                System.out.println("Missão concluida!");
            } else {
                System.out.println("Missão não concluida!");
            }
        }
         else{
                System.out.println("Missão não concluida!");
            }



        System.out.println();
        System.out.println("Ninja 2");
        System.out.println("Nome: " + ninja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Nivel: " + nivelMissao2);

       if (idade2 >= 15) {
           if (nivelMissao2 == 'C' || nivelMissao1 == 'D') {
               System.out.println("Missão concluida!");
           } else {
               System.out.println("Missão não concluida!");
           }
       }
       else {
           System.out.println("Missão não concluida");
       }

        System.out.println();
        System.out.println("Ninja 3");
        System.out.println("Nome: " + ninja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Nivel: " + nivelMissao3);

        if (idade3 >= 15) {
            if (nivelMissao3 == 'C' || nivelMissao1 == 'D') {
                System.out.println("Missão concluida!");
            } else {
                System.out.println("Missão não concluida!");
            }
        }
        else{
            System.out.println("Missão não concluida");
        }

        
    }
}
