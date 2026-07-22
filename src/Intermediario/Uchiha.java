package Intermediario;

public class Uchiha extends Ninja{

    public void sharinganAtivado() {

        System.out.println("Meu nome é " + nome + " O Sharingan Ativou! Eu sou Uchiha");
    }


    //Polimrfismo:
    @Override //-Comentario "Sobrescrever um metodo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha");
    }
}
