package Intermediario.ClassesAbstratasXInterfaces;

public class Uchiha extends Ninja {

    public Uchiha(String aldeia, String nome, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(aldeia, nome, idade, numeroDeMissoesConcluidas, rank);
    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Uchiha, meu metodo de bataia é FOGOOOOOOOOOOOOO!");
    }



    public void nomeNinja(){
        System.out.println("Meu nome é " + nome);
    }
}
