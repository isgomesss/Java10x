package Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    public NinjaAvancado(String nome, int idade, String aldeia, TipoHabilidade habilidade, String especialidade ) {
        super(nome, idade, aldeia, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("O nome do ninja básico é: " + nome);
        System.out.println("A idade do ninja básico é: " + idade);
        System.out.println("A aldeia do ninja básico é: " + aldeia);
        System.out.println("A habilidade do ninja vanaçado é: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("A especialidade do ninja avançado é: " + especialidade);
    }
}

