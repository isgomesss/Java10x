package Desafios.Desafio6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Adicionar 7 ninjas
        LinkedList<Ninja> listaNinjas = new LinkedList<>();

        listaNinjas.add(new Ninja("Naruto Uzumaki", 16, "Vila Oculta da Folha"));
        listaNinjas.add(new Ninja("Sasuke Uchiha", 16, "Vila Oculta da Folha"));
        listaNinjas.add(new Ninja("Sakura Haruno", 16, "Vila Oculta da Folha"));
        listaNinjas.add(new Ninja("Kakashi Hatake", 29, "Vila Oculta da Folha"));
        listaNinjas.add(new Ninja("Itachi Uhciha", 21, "Vila Oculta da Folha"));
        listaNinjas.add(new Ninja("Hinata Hyga", 16, "Vila Oculta da Folha"));
        listaNinjas.add(new Ninja("Gaara", 16, "Vila Oculta da Areia"));

        //Remover o primeiro ninja
        listaNinjas.removeFirst();

        //Adicionar um ninja em primeiro
        listaNinjas.addFirst(new Ninja("Madara Uchiha",30 , "Vila Oculta da Folha"));

        //Exibir lista completa
        for (Ninja n : listaNinjas ){
            System.out.println(n);
        }

        //Ver ninja pelo numero na lista
        System.out.println("\nNinja na posição 5: " + listaNinjas.get(5));

        //Ninjas ordenados por nome:
        Collections.sort(listaNinjas, Comparator.comparing(n -> n.idade));

        System.out.println("\nLista ordenada por nome:");
        for (Ninja n : listaNinjas) {
            System.out.println(n);
        }
    }
}
