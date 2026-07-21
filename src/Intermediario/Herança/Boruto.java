package Intermediario.Herança;

import Intermediario.Uzumaki;

public class Boruto extends Uzumaki implements HyugaUzumaki {


    public void ativarJougan() {
        System.out.println("Eu sou a " + nome + ". E ativei o Jougan!");
    }


    public void ativarKarma() {
        System.out.println("Eu sou a " + nome + ". E ativei o Karma!");
    }
}
