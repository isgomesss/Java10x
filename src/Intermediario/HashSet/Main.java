package Intermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> ninajsList = new ArrayList<>();
        ninajsList.add("Kakashi Hatake");
        ninajsList.add("Madara Uchiha");
        ninajsList.add("Itachi Uchiha");
        ninajsList.add("Gaara do Deserto");


        //Implementação:
        Set<String> ninjasSet = new HashSet<>();


        //Adicionar elementos:
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Sasuke Uchiha");
        ninjasSet.add("Sakura Haruno");
        ninjasSet.add("Naruto Uzumaki");
        System.out.println("Ninjas Set: " + ninjasSet);

        //remover elementos:
        ninjasSet.remove("Sakura Haruno");
        System.out.println("Ninjas Set, apos remove Sakura: " + ninjasSet);

        //Metodo que adiciona o List no Set
        ninjasSet.addAll(ninajsList);
        System.out.println("NinjaSet + NinjaList: " + ninjasSet);

    }
}
