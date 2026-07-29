package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{


    public ContaPoupanca( TipoConta tipoConta, double saldo) {
        super(saldo);
    }

    @Override
    public double depositar(double valor) {
        return this.saldo += valor - ((valor * 1) / 100);
    }

    @Override
    public void tranferencia(ContaBancaria conta, double valor) {
        System.out.println("Tranferencia da conta Poupança para conta Corrente!");
        super.tranferencia(conta, valor);
    }
}
