package Intermediario.ClassesAbstratasXInterfaces;

public class Uzumaki extends Ninja implements NinjaInterface{

    public Uzumaki(int idade, String aldeia, String nome) {
        super(idade, aldeia, nome);
    }

    public void nomeNinja(){
        System.out.println("Meu nome é " + nome);
    }

    public void tacarUmaShuriken(){
        System.out.println("Shuriken");
    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Uzumaki, meu metodo de batalha é RAPOSAAAAAAAAAAAAAAAAAAAA");
    }

    //@Override
    public void metodoProvisorio(){
        System.out.println("Teste nq classe uxumaki");
    }
}

