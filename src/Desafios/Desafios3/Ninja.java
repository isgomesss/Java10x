package Desafios.Desafios3;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificudade;
    String statusDaMissao;

    //metodo mostrar informações:

    public String mostrarInformacoes() {
        return "Nome: " + nome
                + "\nidade: " + idade
                + " \nMissão: " + missao
                + " \nNivel de dificuldade: " + nivelDeDificudade
                + " \nStatus da missão: " + statusDaMissao;
    }
}