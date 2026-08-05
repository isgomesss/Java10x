package Exercicios.Exercicio4;

public class ContaPoupanca extends ContaBancaria{

    double rendido;


    //COnstrutor
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }


    //Metodo
    @Override
    public double calcularRendimento() {
        rendido = getSaldo() * 0.005;
    return rendido + getSaldo();
    }



}
