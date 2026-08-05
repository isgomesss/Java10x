package Intermediario.Generics2;

public class Shuriken {

    private int tamanho;

    public Shuriken(int tamamnho) {
        this.tamanho = tamamnho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Shuriken: " + tamanho;
    }

}
