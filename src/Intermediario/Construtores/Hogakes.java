package Intermediario.Construtores;

public abstract class Hogakes {

    //Classe abstrata: nao pode criar um objeto

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    String missao;

    public Hogakes(String missao, String aldeia, boolean vivoOuNao, int idade, String nome) {
        this.missao = missao;
        this.aldeia = aldeia;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }


    public abstract void sabedoriaHogakes();

    public Hogakes(){}

   /* public Hogakes(String aldeia, String missao){
        this.aldeia = aldeia;
        this.missao = missao;
    }*/



   /* public Hogakes(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        //construtor com argumentos


*/
    }


