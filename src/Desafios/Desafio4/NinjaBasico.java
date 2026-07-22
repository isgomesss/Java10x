package Desafios.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String aldeia;
    TipoHabilidade habilidade;


    public NinjaBasico(String nome, int idade, String aldeia, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("O nome do ninja básico é: " + nome);
        System.out.println("A idade do ninja básico é: " + idade);
        System.out.println("A aldeia do ninja básico é: " + aldeia);
        System.out.println("A habilidade do ninja básico é: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ha habilidade do ninja básico é: Super velocidade. ");
    }


}
