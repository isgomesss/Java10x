package Intermediario;

public class Uzumaki extends Ninja{

    public void modoSabio() {
        System.out.println("Meu nome é " + nome + " e eu ativei o modo Sabio ");
    }

    //POLIMORFISMO - SOBRESCREVE O METODO
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaque");
    }
}
