package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public abstract double depositar(double valor);

    public void tranferencia(ContaBancaria conta, double valor){
        saldo -= valor;
        conta.depositar(valor);
    }
}
