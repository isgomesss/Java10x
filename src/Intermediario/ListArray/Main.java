package Intermediario.ListArray;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //List: Não são estaticas! Podem aumentar ou diminuir
        //Arrays: São estaticos, não se altera, cria um objeto na memoria

        //Arrays
        String[] ninjaArray = new String[3];
        ninjaArray[0] = "Naruto Uzumaki";
        ninjaArray[1] = "Sasuke Uchiha";
        ninjaArray[2] = "Sakura Haruno";

        //Mostrar Array
        for (int i = 0; i < ninjaArray.length; i++) {
            System.out.println("Ninja: " + ninjaArray[i]);

        }
        //Lista
        //Adicionar ninja:
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add ("Narutinho");
        ninjasList.add ("Sasuke");
        ninjasList.add ("Sakura");
        ninjasList.add("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);

        //Remover ninja:
        ninjasList.remove("Narutinho");
        System.out.println("ninjasList = " + ninjasList);

        //Trocar ninja:
        ninjasList.set(2, "Hashirama");
        System.out.println("ninjasList = " + ninjasList);

        //Ver tamanho:
        System.out.println("Tamanho da lista: " + ninjasList.size() + " elementos");
    }
}
