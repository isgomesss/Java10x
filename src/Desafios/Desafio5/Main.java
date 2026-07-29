package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {


        ContaCorrente contaCorrente = new ContaCorrente(TipoConta.CORRENTE, 100.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca( TipoConta.POUPANÇA, 100);

        System.out.println("Seu saldo em conta Corrente é: " + contaCorrente.consultarSaldo());
        contaCorrente.depositar(50);
        contaCorrente.tranferencia(contaPoupanca, 40);
        System.out.println("Seu saldo em conta Corrente é: " + contaCorrente.consultarSaldo());


        System.out.println("");

        System.out.println("Seu saldo em conta Poupança é: " + contaPoupanca.consultarSaldo());

        contaPoupanca.depositar(100);
        contaPoupanca.tranferencia(contaCorrente, 60);
        System.out.println("Seu saldo em conta Poupança é: " + contaPoupanca.consultarSaldo() + "\n(ATENÇÃO! Depositos na conta poupança, exige 1% de dedução!)");
    }
}