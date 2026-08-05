package Intermediario.GetESet;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoes;
    private double altura = 2.10;

    //construtor


    public Ninja() {}

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoes = numeroDeMissoes;
        this.altura = altura;
    }


    //nome
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //aldeia
    public String getAldeia(){
        return this.aldeia;
    }

    public void setAldeia(String aldeia){
        this.aldeia = aldeia;
    }

    //idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    //numero de missoes
    public int getNumeroDeMissoes(){
        return this.numeroDeMissoes;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes){
        this.numeroDeMissoes = numeroDeMissoes;
    }

    //altura
    public double getAltura(){
        return this.altura;
    }

    public void setAltura( double altura){
        this.altura = altura;
    }
}
