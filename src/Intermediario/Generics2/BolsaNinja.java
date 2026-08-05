package Intermediario.Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    //Iniciar o Array
    private List<T> ferramentas;

    //Construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Adicionar ferramentas no array
    public void adicionarferramentas(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //Mostrar lista de ferramentas

    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
            
        }
    }
}
