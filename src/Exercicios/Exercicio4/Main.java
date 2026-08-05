package Exercicios.Exercicio4;

public class Main {
    public static void main(String[] args) {

    ContaPoupanca contaBancaria1 = new ContaPoupanca("Isadora Gomes", 5000);
        System.out.println(contaBancaria1.getTitular());
        System.out.println(contaBancaria1.getSaldo());
        System.out.println(contaBancaria1.calcularRendimento());


        System.out.println(contaBancaria1.sacarValor(200));
        System.out.println(contaBancaria1.getSaldo());
        System.out.println(contaBancaria1.calcularRendimento());
    }
}
