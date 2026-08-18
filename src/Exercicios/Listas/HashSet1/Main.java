package Exercicios.Listas.HashSet1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
/*
 Crie um HashSet<String> de animais de um zoológico e adicione pelo menos 5, com duas repetidas de propósito
 (ex: "Leão", "Elefante", "Girafa", "Leão", "Zebra"). Depois:

Imprima quantos animais únicos ficaram no set (size())
Verifique se "Elefante" está na coleção
Remova um animal e mostre o set atualizado
*/

        Set<String> animais = new HashSet<>();
        animais.add("leão");
        animais.add("Elefante");
        animais.add("Girafa");
        animais.add("leão");
        animais.add("Zebra");
        System.out.println("Lista de animais: " + animais);

        System.out.println("\nAnimais na lista: " + animais.size());

        System.out.println("\nElefante esta na lista? " + animais.contains("Elefante"));

        animais.remove("Girafa");
        System.out.println("\nLista atualizada " + animais);
    }
}
