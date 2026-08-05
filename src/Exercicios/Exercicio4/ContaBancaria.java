package Exercicios.Exercicio4;

public abstract class ContaBancaria {

    private String titular;
    private double saldo;

    //Construtor
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }


    //----TITULAR----------------------------------------------------
    //set - coloca nome
    public void setTitular(String titular){
        this.titular = titular;
    }

    //get - mostra nome
    public String getTitular(){
        return titular;
    }

    //----SALDO-------------------------------------------------------
    /*
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    */

    public  double getSaldo(){
        return saldo;
    }

    //--------METODOS-------------------------------------------------------
    //metodo para calcular rendimento:
    public abstract double calcularRendimento();

    //metodo sacar
     public boolean sacarValor(double valor){
        if (saldo >= valor) {
            saldo -= valor;

            return true;
        }
        return false;
     }
}
