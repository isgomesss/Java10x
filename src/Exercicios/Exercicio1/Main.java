package Exercicios.Exercicio1;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Billy";
        cachorro.idade = 4;
        cachorro.raca = "Salsicha";
        cachorro.mostrarInformacoes();
        cachorro.latir();
        System.out.println(" ");

        Gerente gerente = new Gerente();
        gerente.nome = "Claudio";
        gerente.cargo = "Gerente";
        gerente.salario = 2000.00;
        gerente.setor = "Animais";
        gerente.mostrarInformacoes();
    }
}
