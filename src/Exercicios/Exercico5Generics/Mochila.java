package Exercicios.Exercico5Generics;

import java.util.ArrayList;
import java.util.List;

public class Mochila<T> {

    private List<T> itens;

    public Mochila() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(T iten){
        itens.add(iten);
    }


    public void mostrarItens(){
        for (T iten : itens)
        System.out.println(iten);
    }


}
