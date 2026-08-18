package Exercicios.Listas.ArrayEHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
* Crie uma ArrayList<String> com nomes de eletrônicos que os clientes de uma loja compraram, com
* repetições de propósito (tipo 10 elementos: "Celular", "TV", "Celular", "Fone", "Notebook", "TV", "Celular",
* "Tablet", "Fone", "TV"). Depois:

Passe esses elementos para um HashSet<String>
Imprima o tamanho da lista original e do set
Isso mostra quantos produtos diferentes foram vendidos, sem contar duplicata*/

        List<String> eletronicos = new ArrayList<>();
        eletronicos.add("Celular");
        eletronicos.add("Televisão");
        eletronicos.add("Celular");
        eletronicos.add("Fone de ouvido");
        eletronicos.add("Notebook");
        eletronicos.add("TV");
        eletronicos.add("Celular");
        eletronicos.add("Tablet");
        eletronicos.add("Fone");
        eletronicos.add("TV");
        System.out.println("Tamanho da lista original: " + eletronicos.size());

        Set<String> eletronicosSet = new HashSet<>();
        eletronicosSet.addAll(eletronicos);

        System.out.println("Tamanho da lista Set: " + eletronicosSet.size());

        System.out.println("itens da lista: " + eletronicosSet);

    }
}
