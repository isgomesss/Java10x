package Intermediario.Construtores;

public class Main {
    public static void main(String[] args) {



        // CONTRUTORES: 1- sem argumentos:
        //2- com argumentos:

        Hogakes hashirama = new Hogakes("isadora", 19);
        System.out.println(hashirama.nome);
        System.out.println(hashirama.idade);

        Hogakes tobirama = new Hogakes("Foia", "Roubar");
        System.out.println(tobirama.aldeia);
        System.out.println(tobirama.missao);
    }
}
