package Intermediario.ClassesAbstratasXInterfaces;

public class Uchiha extends Ninja {

    public Uchiha(int idade, String aldeia, String nome) {
        super(idade, aldeia, nome);
    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Uchiha, meu metodo de bataia é FOGOOOOOOOOOOOOO!");
    }

    public void nomeNinja(){
        System.out.println("Meu nome é " + nome);
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha inteligencia de combate ");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e voce é um genio!");
        } else if (qi >= 130) {
            System.out.println("Seu Qi é: " + qi + "e voce é um ninja promissor");
        } else {
            System.out.println("Seu Qi é: " + qi + "e voce precisa treinar mais suas estrategias");
        }
    }

    @Override
    public void metodoProvisorio(){
        System.out.println("Teste nq classe uchiha");
    }
}
