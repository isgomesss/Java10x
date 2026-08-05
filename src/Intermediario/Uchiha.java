package Intermediario;

public class Uchiha extends Ninja{

    Biju biju;

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    /*Metodo:
    *Implementando da interface Sharingan
    */
    public void sharinganAtivado() {
        System.out.println("O Sharingan Ativou! Eu sou Uchiha");
    }

}
