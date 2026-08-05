package Intermediario;

public class Uzumaki extends Ninja{

    Biju biju;
    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    public void modoSabio() {
        System.out.println("Meu nome é " + nome + " e eu ativei o modo Sabio ");
    }


    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaque");
    }
}
