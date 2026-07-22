package Exercicios.Exercicio1;

public class Cachorro extends Animal {

    String raca;

    public void latir() {
        System.out.println("Au Au");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome +
                ".\nMinha idade é " + idade +
                ".\nMinha raça é " + raca );
    }
}
