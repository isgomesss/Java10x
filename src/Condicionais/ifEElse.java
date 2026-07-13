package Condicionais;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * If Else - condição
        */

        String nome = "Naruto Uzumaki";
        int idade = 21;
        boolean hokague = false;
        short numeroDeMissoes = 20;

        /*
        * Se condição, faça isso
        * else if (se nao for faça)
        * else (caso nada seja verdadeiro)
        * */

        if (numeroDeMissoes == 10 && idade >= 15){
        System.out.println("Rank: Chunnin");
        }

        else if (numeroDeMissoes > 15 && idade > 20){
            System.out.println("Rank: Jounnin");
        }

        else if (numeroDeMissoes >= 20 && idade > 25){
            System.out.println("Rank: Hokague");
        }

        else  {
            System.out.println("Rank: Gennin");
        }




    }
}
