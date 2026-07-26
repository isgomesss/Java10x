package Intermediario.Construtores;

public class Senju extends Hogakes{

    @Override
    public void sabedoriaHogakes() {
        System.out.println("Você ganhou sabedoria");
    }

    public Senju (){
        super();
    }

    public Senju(String missao, String aldeia, boolean vivoOuNao, int idade, String nome ){
        super(missao, aldeia, vivoOuNao, idade, nome );
    }
}
