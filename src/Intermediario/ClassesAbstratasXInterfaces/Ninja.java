package Intermediario.ClassesAbstratasXInterfaces;

public abstract class Ninja implements EstrategiaDeBataha {

    //apos se tornar abstrata, nao pode criar objetos

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    RankNinja rank;


    //TODO: Incluir novos 2 atributos: rank,, numerodemissao;
    //TODO: rank: gennin,chunin, jounnin, hokage

    public Ninja(int idade, String aldeia, String nome) {
        this.idade = idade;
        this.aldeia = aldeia;
        this.nome = nome;
    }

    //toda vezz que declado um construtor ele se otrna imutavel
    //fazemos uma sobrecarga chamando os novos elementos


    public Ninja(String aldeia, String nome, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(idade, nome, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void nomeNinja();
    //metodo abstrato obrigatorio em todas as classes

    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai");

        //subclasse da classe ninja serao obrigadas a utilizar este metodo
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("bataiao");

    }
}
