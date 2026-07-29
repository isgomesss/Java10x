package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente(TipoConta tipoConta, double saldo) {
        super(saldo);
    }

    @Override
    public double depositar(double valor){
        return this.saldo += valor;
    }

    @Override
    public void tranferencia(ContaBancaria conta, double valor) {
        System.out.println("Tranferencia da conta Corrente para conta Poupança!");
        super.tranferencia(conta, valor);
    }
}
