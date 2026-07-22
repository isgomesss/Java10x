package Intermediario.Construtores;

import javax.xml.stream.util.StreamReaderDelegate;

public class Hogakes {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    String missao;

    public Hogakes(String aldeia, String missao){
        this.aldeia = aldeia;
        this.missao = missao;
    }

    public Hogakes(String missao, String aldeia, boolean vivoOuNao, int idade, String nome) {
        this.missao = missao;
        this.aldeia = aldeia;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }

    public Hogakes(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        //construtor com argumentos



    }
}

