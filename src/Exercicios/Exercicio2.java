package Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {

        int maximo = 2147483647;
        System.out.println("O numero maximo suportado no int é: " + maximo);

        int overFlow;
        overFlow = maximo + 1;

        System.out.println("O que acontece quando somamos o numero maximo de int com + 1? " + overFlow);
        System.out.println("O numero soma +1 e se torna negativo.");
    }
}
