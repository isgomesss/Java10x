package Desafios3;

public class Uchiha extends Ninja{

    //Atributo habilidade especial:

    String habilidadeEspecial;

    public String mostrarHabilidadeEspecial(){
        return  " " + habilidadeEspecial;
    }


    public String mostrarInformacoes() {
        return "Nome: " + nome
                + "\nidade: " + idade
                + " \nMissão: " + missao
                + " \nNivel de dificuldade: " + nivelDeDificudade
                + " \nStatus da missão: " + statusDaMissao
                + " \nHabilidade especial: " + mostrarHabilidadeEspecial();
    }
}

